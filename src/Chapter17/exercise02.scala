/**
 * 定义一个可变类Pair[T]，带一个swap方法，交换对偶中组件的位置。
 */
class Pair[T](val s:T,val t:T){
  def swap() = new Pair(t,s)
}
