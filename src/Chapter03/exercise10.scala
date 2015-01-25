import java.awt.datatransfer.{DataFlavor, SystemFlavorMap}
import collection.JavaConversions.asScalaBuffer
import scala.collection.mutable

/**
 * 引入java.awt.datatransfer.并构建一个类型为SystemFlavorMap类型的对象:
  val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
  然后以DataFlavor.imageFlavor为参数调用getNativesForFlavor方法，以Scala缓冲保存返回值。
 (为什么用这样一个晦涩难懂的类？因为在Java标准库中很难找到使用java.util.List的代码)
 */
def test():Unit = {
  val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
  val res:mutable.Buffer[String] = flavors.getNativesForFlavor(DataFlavor.imageFlavor)
  println(res)
}
