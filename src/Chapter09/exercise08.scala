/**
 * 编写Scala程序打印出某个网页中所有img标签的src属性。使用正则表达式和分组
 */
val pattern = """<img[^>]+(src\s*=\s*"[^>^"]+")[^>]*>""".r
val source = scala.io.Source.fromURL("http://www.vernonzheng.com","utf-8").mkString

for (pattern(str) <- pattern.findAllIn(source)) println(str)

