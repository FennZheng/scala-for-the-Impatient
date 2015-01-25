/**
 * 当你将两个字符串拉链在一起，比如"Hello".zip("World")，会是什么结果？想出一个讲得通的用例
 */
def testZip():Unit = {
  /**
   * * StringOps中的zip定义如下:
abstract def zip[B](that: GenIterable[B]): StringOps[(A, B)]
GenIterable是可遍历对象需要包含的trait，对于String来说，它是可遍历的。但是它的遍历是遍历单个字母。 所以拉链就针对每个字母来进行。
   */

  "Hello".zip("hello").toMap

  /**
   * scala.collection.immutable.Map[Char,Char] = Map(H -> h, e -> e, l -> l, o -> o)
   */
}
