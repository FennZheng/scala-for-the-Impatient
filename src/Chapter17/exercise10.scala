/**
 * 给定可变类Pair[S,T]，使用类型约束定义一个swap方法，当类型参数相同时可以被调用。
 */
class Pair[S,T](val s:S, val t:T){
  def swap(implicit env: S =:= T) = new Pair(t,s)
}