/**
 * 打印XHTML文件中所有图像的名称，即打印所有位于img元素内的src属性值
 */
import scala.xml.XML

var html = "<html><head><title>第一个网页</title></head><body><p><img alt='a'><img src='1'></img></p></body></html>"
val images = (html \\ "img").flatMap(_.attributes("src"))
val images1 = html match{
  case n @ <img/> => Some(n.attributes("src"))
}

println(images.mkString("\n"));
println(images1.mkString("\n"));
