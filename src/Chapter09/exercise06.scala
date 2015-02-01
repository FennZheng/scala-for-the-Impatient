/**
 * 编写正则表达式,匹配Java或C++程序代码中类似"like this,maybe with \" or\\"
 * 这样的带引号的字符串。编写Scala程序将某个源文件中所有类似的字符串打印出来
 */
val source = scala.io.Source.fromFile("test.txt").mkString

val pattern = """"([^"\\]*([\\]+"[^"\\]*)*)"""".r

pattern.findAllIn(source).foreach(println)