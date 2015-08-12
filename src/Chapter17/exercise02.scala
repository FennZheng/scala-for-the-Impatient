/**
 * 定义一个可变类Pair[T]，带一个swap方法，交换对偶中组件的位置。
 */
class Pair[T] (var s: T, var t: T) {
  def swap() = {
    val temp = s
    this.s = t
    this.t = temp
  }
  override def toString = s"s: $s, t: $t"
}
