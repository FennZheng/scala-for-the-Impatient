/**
 * 对一个XHTML文档进行变换，对所有不带alt属性的img元素添加一个alt="TODO"属性，其他>内容完全不变。
 */
import scala.xml._
val html = ""
val replaceNoneAlt = html match{
  case img @ <img/> if(!_.attribute(alt)) => img % Attribute(null,"alt","TODO",null)
}
println(replaceNoneAlt)