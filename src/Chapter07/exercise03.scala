/**
 * 编写一个包random,加入函数nextInt():Int,nextDouble():Double,setSeed(seed:Int):Unit。
 * 生成随机数的算法采用线性同余生成器
 */

package object random{

  var seed:Int = _
  val a = BigDecimal(1664525)
  val b = BigDecimal(1013904223)
  val n = 32

  def nextInt():Int={
    val temp = (seed * a + b) % BigDecimal(2).pow(n)
    seed = temp.toInt
    seed
  }

  def nextDouble():Double={
    val temp = (seed * a + b) % BigDecimal(2).pow(n)
    seed = temp.toInt
    temp.toDouble
  }
}
import random._
object Q3 extends App {
  (1 to 10).foreach(x => println(nextInt()))
  (1 to 10).foreach(x => println(nextDouble()))
}