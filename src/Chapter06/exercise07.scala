/**
 * 实现一个函数,检查某张牌的花色是否为红色
 */
object Suits extends Enumeration {
  type Suits = Value
  val Spade = Value("♠")
  val Club = Value("♣")
  val Heart = Value("♥")
  val Diamond = Value("♦")
  def isRed(card: Suits) = card == Heart || card == Diamond
}
