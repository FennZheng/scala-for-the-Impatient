/**
 * 定义一个抽象类Shape，一个抽象方法centerPoint，以及该抽象类的子类Rectangle和Circle。
 * 为子类提供合适的构造器，并重写centerPoint方法
 */
package Q6 {
  abstract class Shape {
    def centerPoint()
  }

  class Rectangle(startX: Int, startY: Int, endX: Int, endY: Int) extends Shape {
    def centerPoint() {}
  }

  class Circle(x: Int, y: Int, radius: Double) extends Shape {
    def centerPoint() {}
  }
}