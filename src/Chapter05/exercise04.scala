/**
 * 重新实现前一个类中的Time类，将内部呈现改成午夜起的分钟数(介于0到24*60-1之间)。
 * 不要改变公有接口。也就是说，客户端代码不应因你的修改而受影响
 */
class Time(private[this] val hrs:Int,private[this] val min:Int){
  val minutesInDay = hrs*24+min
  def before(other:Time):Boolean = {
    if(minutesInDay<other.minutesInDay)
      true
    false
  }
}