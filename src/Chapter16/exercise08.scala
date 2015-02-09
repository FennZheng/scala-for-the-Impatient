/**
 * 编写一个函数，接受dl元素，将它转成Map[String,String]。该函数应该是前一个练习中的反向处理，前提是所有dt后代都是唯一的。
 */
def htmlToMap(str:String):Map[String,String] = {
  val dtMap = (str \\ "dt").toMap
  val ddMap = (str \\ "dd").toMap
  dtMap.zip(ddMap)
}

val html = <dl><dt>A</dt><dd>1</dd><dt>B</dt><dd>2</dd></dl>
println(htmlToMap(html).mkString(","))