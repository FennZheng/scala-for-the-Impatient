/**
 * 编写Scala程序，从文本文件读取内容，并打印出所有的非浮点数的词法单位。要求使用正则表达式
 */
import io.Source

val source = Source.fromFile("exercise07.txt").mkString

val pattern = """[^((\d+\.){0,1}\d+)^\s+]+""".r

pattern.findAllIn(source).foreach(println)