/**
 * 定义一个 Point 类和一个伴生对象,使得我们可以不用 new 而直接用 Point(3,4)来构造 Point 实例 apply 方法的使用
 */
class Point(x: Int = 0, y: Int = 0) extends java.awt.Point(x, y)

object Point {
  def apply(x: Int = 0, y: Int = 0) = new Point(x, y)
}