/**
 * 考虑如下对物理度量建模的类：
abstract class Dim[T](val value: Double, val name: String){
        protected def create(v: Double): T
        def + (other: Dim[T]) = create(value + other.value)
        override def toString() = value + " " + name
}
以下是具体子类：
class Seconds(v: Double) extends Dim[Seconds](v, "s"){
        override def create(v: Double) = new Seconds(v)
}
但现在不清楚状况的人可能会定义
class Meters(v: Double) extends Dim[Seconds](v, "m"){
        override def create(v: Double) = new Seconds(v)
}
允许米（Meters）和秒（Seconds）相加。使用自身类型来防止发生这样的情况。
 */

abstract class Dim[T](val value: Double, val name: String){
  this: T =>
  protected def create(v: Double): T
  def + (other: Dim[T]) = create(value + other.value)
  override def toString() = value + " " + name
}
class Seconds(v: Double) extends Dim[Seconds](v, "s"){
  override def create(v: Double) = new Seconds(v)
}
class Meters(v: Double) extends Dim[Seconds](v, "m"){
  override def create(v: Double) = new Seconds(v)
}
//Meters can not extends Dim[Seconds] and compile fail