/**
 * 改进5.1节的Counter类,让它不要在Int.MaxValue时变成负数
 */
class Counter(){
  private var value = 0
  def increment(){ if(value<Int.MaxValue) value += 1 }
  def current() = value
}