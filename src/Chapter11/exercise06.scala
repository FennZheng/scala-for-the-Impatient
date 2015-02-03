/**
 * 提供一个ASCIIArt类，其对象包含类似这样的图形:
     /\_/\
    ( ' ' )
    (  -  )
     | | |
    (__|__)
    提供将两个ASCIIArt图形横向或纵向结合的操作符。选用适当优先级的操作符命名。纵向结合的实例
     /\_/\     -----
    ( ' ' )  / Hello \
    (  -  ) <  Scala |
     | | |   \ Coder /
    (__|__)    -----
 */
import collection.mutable.ArrayBuffer

class ASCIIArt(str:String){
  val arr:ArrayBuffer[ArrayBuffer[String]] = new ArrayBuffer[ArrayBuffer[String]]()

  if (str != null && !str.trim.eq("")){
    str.split("[\r\n]+").foreach{
      line =>
        val s = new ArrayBuffer[String]()
        s += line
        arr += s
    }
  }

  def this(){
    this("")
  }

  def +(other:ASCIIArt):ASCIIArt={
    val art = new ASCIIArt()
    val length = if (this.arr.length >= other.arr.length) this.arr.length else other.arr.length
    for(i <- 0 until length){
      val s = new ArrayBuffer[String]()
      val thisArr:ArrayBuffer[String] = if (i < this.arr.length) this.arr(i) else new ArrayBuffer[String]()
      val otherArr:ArrayBuffer[String] = if (i < other.arr.length) other.arr(i) else new ArrayBuffer[String]()
      thisArr.foreach(s += _)
      otherArr.foreach(s += _)
      art.arr += s
    }
    art
  }

  def *(other:ASCIIArt):ASCIIArt={
    val art = new ASCIIArt()
    this.arr.foreach(art.arr += _)
    other.arr.foreach(art.arr += _)
    art
  }

  override def toString()={
    var ss:String = ""
    arr.foreach{
      ss += _.mkString(" ") + "\n"
    }
    ss
  }
}

object Test extends App{
  val a = new ASCIIArt(""" /\_/\
                         |( ' ' )
                         |(  -  )
                         | | | |
                         |(__|__)
                         |""".stripMargin)
  val b = new ASCIIArt( """    -----
                          |  / Hello \
                          | <  Scala |
                          |  \ Coder /
                          |    -----
                          |""".stripMargin)
  println(a + b * b)
  println((a + b) * b)
  println(a * b)
}
