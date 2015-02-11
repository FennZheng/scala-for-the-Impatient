/**
 * 给定类Pair[T, S] ，编写一个泛型方法swap，接受对偶作为参数并返回组件交换过位置的新对偶。
 */
class Pair[T,S](val t:T, val s:S){
  def swap[T,S](t:T,s:S) = new Pair(s,t)
}