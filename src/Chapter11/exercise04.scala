/**
 * 实现一个Money类,加入美元和美分字段。提供+,-操作符以及比较操作符==和<。
 * 举例来说，Money(1,75)+Money(0,50)==Money(2,25)应为true。
 * 你应该同时提供*和/操作符吗？为什么？
 */
class Money(dollar:Int,cent:Int){
  def + (other:Money):Money = {
    val (a,b) = (this.cent + other.cent) % 100
    new Money(this.dollar + other.dollar + a,b)
  }
  def -(other:Money):Money={
    val (d,c) = (this.toCent() - other.toCent()) % 100
    new Money(d,c)
  }
  def ==(other:Money):Boolean = this.dollar == other.dollar && this.cent == other.cent

  def <(other:Money):Boolean = this.dollar < other.dollar || (this.dollar == other.dollar && this.cent < other.cent)

  override def toString = "dollar = " + dollar + " cent = " + cent

  private def toCent()={
    this.dollar * 100 + this.cent
  }
}
object Money{
  def apply(dollar:Int, cent:Int): Money ={
    new Money(dollar,cent)
  }
  def main(args:Array[String]){

    val m1 = Money(1,200)
    val m2 = Money(2,2)
    println(m1 + m2)
    println(m1 - m2)
    println(m1 == m2)
    println(m1 < m2)
    println(Money(1,75)+Money(0,50))
    println(Money(1,75)+Money(0,50)==Money(2,25))

  }
}