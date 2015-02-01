/**
 * 编写一小段Scala代码,从一个文件读取内容并把所有字符数大于12的单词打印到控制台。如果你能用单行代码完成会有额外奖励
 */
scala.io.Source.fromFile("./exercise03.txt").mkString.split("\\s+").foreach(line=> if(line.length>12) println(line))