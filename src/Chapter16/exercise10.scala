/**
 * 编写一个函数，读取XHTML文档，执行前一个练习中的变换，并保存结果。确保保留了DTD以及所有CDATA内容。
 */
import xml._
import xml.transform._
import xml.parsing.ConstructingParser
import xml.dtd.DocType
import java.io.File

val doc = ConstructingParser.fromFile(new File("./test.xml"),
  true).document
val a = doc.docElem

val imgRule = new RewriteRule {
  override def transform(n:Node) = n match {
    case i @ <img>{_*}</img> if(i.attribute("alt") == None) =>
      i % Attribute(null, "alt", "TODO", Null)
    case _ => n
  }
}

val result = new RuleTransformer(imgRule).transform(a)
XML.save("./test.xml", result(0), "UTF-8", false,
  DocType("html", doc.dtd.externalID, Nil))