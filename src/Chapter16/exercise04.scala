/**
 * 读取一个XHTML文件并打印所有不带alt属性的img元素
 */

import scala.xml.XML

var html = "<html><head><title>第一个网页</title></head><body><p><img alt='a'><img src='1'></img></p></body></html>"
val images = (html \\ "img").filterNot(_.attributes("alt").isDefined)
val images1 = html match{
  case n @ <img/> if (!n.attributes("alt")) => n
}

println(images.mkString("\n"));
println(images1.mkString("\n"));