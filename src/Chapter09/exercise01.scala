import java.io.PrintWriter

import scala.io.Source

/**
 * 编写一小段Scala代码，将某个文件中的行倒转顺序(将最后一行作为第一行,依此类推)
 */
val path = "./exercise01.txt"
val file = Source.fromFile(path)
val reverseLines = file.getLines().toArray.reverse
val pw = new PrintWriter(path)
reverseLines.foreach (line => pw.write(line+"\n"))
pw.close()


