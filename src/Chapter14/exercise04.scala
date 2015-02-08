/**
 * 添加一个样例类Multiple，作为Item的子类。
 * 举例来说，Multiple(10,Article("Blackwell Toster",29.95))描述的是10个烤面包机。
 * 当然了，你应该可以在第二个参数的位置接受任何Item，无论是Bundle还是另一个Multiple。
 * 扩展price函数以应对新的样例。
 */
abstract class Item
case class Multiple(num : Int,item : Item) extends Item
case class Article(description : String , price : Double) extends Item
case class Bundle(description : String , discount : Double , item : Item*) extends Item

def price(it : Item) : Double = it match {
  case Article(_,p) => p
  case Bundle(_,disc,its @ _*) => its.map(price _).sum - disc
  case Multiple(n,it) => n * price(it)
}

val p = price(Multiple(10,Article("Blackwell Toster",29.95)))
println(p)