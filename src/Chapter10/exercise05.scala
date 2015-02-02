/**
 * JavaBean规范里有一种提法叫做属性变更监听器(property change listener)，
 * 这是bean用来通知其属性变更的标准方式。
 * PropertyChangeSupport类对于任何想要支持属性变更通知其属性变更监听器的bean而言是个便捷的超类。
 * 但可惜已有其他超类的类—比如JComponent—必须重新实现相应的方法。
 * 将PropertyChangeSupport重新实现为一个特质,然后将它混入到java.awt.Point类中
 */
import java.awt.Point
import java.beans.PropertyChangeSupport

trait PropertyChange extends PropertyChangeSupport

val p = new Point() with PropertyChange