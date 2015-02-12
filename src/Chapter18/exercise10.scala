/**
 * 自身类型通常可以被扩展自身的特质替代，但某些情况下使用自身类型会改变初始化和重写的顺序。构造出这样的一个示例。
 */
trait A {
  def sing() = "from a"
}

trait C {
  this: A =>
  val w = sing + "from c"
}

class B{
  this: C =>
  val k = w
}

val b = new B with C with A
println(b.k)