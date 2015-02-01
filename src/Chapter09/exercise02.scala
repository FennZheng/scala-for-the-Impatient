/**
 * 编写Scala程序,从一个带有制表符的文件读取内容,将每个制表符替换成一组空格,
 * 使得制表符隔开的n列仍然保持纵向对齐,并将结果写入同一个文件
 */
import io.Source
import java.io.PrintWriter

val path = "exercise01.txt"

val reader = Source.fromFile(path).getLines()

val result = for ( t <- reader) yield t.replaceAll("\\t","    ")

val pw = new PrintWriter(path)

result.foreach(line => pw.write(line + "\n"))

pw.close()
