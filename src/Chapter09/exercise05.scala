/**
 * 编写Scala程序，向文件中写入2的n次方及其倒数，指数n从0到20。对齐各列:
      1         1
      2         0.5
      4         0.25
    ...         ...
 */
import java.io.PrintWriter

val pw = new PrintWriter("exercise05.txt")

for ( n <- 0 to 20){
  val t = BigDecimal(2).pow(n)
  pw.write(t.toString())
  pw.write("\t\t")
  pw.write((1/t).toString())
  pw.write("\n")
}

pw.close()