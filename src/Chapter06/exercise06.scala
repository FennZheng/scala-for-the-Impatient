/**
 * 编写一个扑克牌 4 种花色的枚举,让其 toString 方法分别返回♣,♦,♥,♠
 */
object Suits extends Enumeration{
  type Suits = Value
  val Spade = Value("♠")
  val Club = Value("♣")
  val Heart = Value("♥")
  val Diamond = Value("♦")
  override def toString():String={
    Suits.values.mkString(",")
  }
}