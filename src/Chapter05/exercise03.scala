/**
 * 编写一个Time类，加入只读属性hours和minutes，
 * 和一个检查某一时刻是否早于另一时刻的方法before(other:Time):Boolean。
 * Time对象应该以new Time(hrs,min)方式构建。其中hrs以军用时间格式呈现(介于0和23之间)
 */
class Time(private[this] val hrs:Int,private[this] val min:Int){
  val hours = hrs
  val minutes = min
  def before(other:Time):Boolean = {
    if(hours<other.hours)
      true
    if(hours==other.hours)
      if(minutes<other.minutes)
        true
    false
  }
}