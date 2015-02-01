/**
 * 通过把scala.math.Ordered[Point]混入java.awt.Point的方式，
 * 定义OrderedPoint类。
 * 按辞典编辑方式排序，也就是说，如果x<x'或者x=x'且y<y'则(x,y)<(x',y')
 */
import java.awt.Point
class OrderedPoint extends Point with Ordered[Point]{
  override def compare(that: Point): Int = {
    if (this.x <= that.x && this.y < that.y) -1
    else if (this.x == that.x && this.y == that.y) 0
    else 1
  }
}

