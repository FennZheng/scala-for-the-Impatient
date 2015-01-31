import java.awt.Point

/**
 * 定义一个扩展自 java.awt.Point 的 Origin 对象。为什么说这实际上不是个好主意？(仔细看 Point 类的方法)
    Point 中的 getLocation 方法返回的是 Point 对象，如果想返回 Origin 对象，需要 Origin 类才行
 */
object Origin extends Point{
  override def getLocation : Point = super.getLocation
}
