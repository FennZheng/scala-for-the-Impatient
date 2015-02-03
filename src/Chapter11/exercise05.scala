/**
 * 提供操作符用于构造HTML表格。
 * 例如:Table() | "Java" | "Scala" || "Gosling" | "Odersky" || "JVM" | "JVM,.NET"
 * 应产出:<table><tr><td>Java</td></tr><td>Scala</td></tr><tr><td>Gosling…
 */
class Table{

  var s:String = ""

  def |(str:String):Table={
    val t = Table()
    t.s = this.s + "<td>" + str + "</td>"
    t
  }

  def ||(str:String):Table={
    val t = Table()
    t.s = this.s + "</tr><tr><td>" + str + "</td>"
    t
  }

  override def toString():String={
    "<table><tr>" + this.s + "</tr></table>"
  }
}

object Table{

  def apply():Table={
    new Table()
  }

  def main(args: Array[String]) {
    println(Table() | "Java" | "Scala" || "Gosling" | "Odersky" || "JVM" | "JVM,.NET")
  }
}