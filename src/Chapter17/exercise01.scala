/**
 * 定义一个不可变类Pair[T,S], 带一个swap方法，返回组件交换过位置的新对偶
 */
class Pair[T,S](val t:T,val s:S){
  def swap() = new Pair(s,t)
}
