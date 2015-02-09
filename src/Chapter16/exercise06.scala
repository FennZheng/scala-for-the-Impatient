/**
 * 读取XHTML文件并打印一个包含了文件中给出的所有超链接及其url的表格。即，打印所有a元素的child文本和href属性。
 */
import scala.xml._

val html = ""
val links = (html \\ "a") map { (x: Node) => (x.attribute("href").getOrElse("").toString, x.text) } filter {_._1.startsWith("http")}

println(links.mkString("\n"));
