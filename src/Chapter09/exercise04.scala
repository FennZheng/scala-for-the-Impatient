/**
 * 编写Scala程序，从包含浮点数的文本文件读取内容，打印出文件中所有浮点数之和，平均值，最大值和最小值
 */
import scala.io.Source
val nums = Source.fromFile("exercise01.txt").mkString.split("\\s+")

var total = 0d

nums.foreach(total += _.toDouble)

println(total)
println(total/nums.length)
println(nums.max)
println(nums.min)