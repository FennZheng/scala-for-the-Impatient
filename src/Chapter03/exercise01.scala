import scala.util.Random
import scala.math.random
/**
 * 编写一段代码，将a设置为一个n个随机整数的数组，要求随机数介于0(包含)和n(不包含)之间
 *
 */
def randomArray(n: Int) :Array[Int] = {
  val array = for( i<- 0 to n) yield Random.nextInt(n)
  array.toArray
}

def randomArray2(n: Int) :Array[Int] = {
  val array = for( i<- 0 to n) yield (random * n).toInt
  array.toArray
}