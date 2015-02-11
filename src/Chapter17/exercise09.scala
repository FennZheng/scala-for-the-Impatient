/**
 * 在一个不可变类Pair[+T]中限制方法参数看上去可能有些奇怪。不过，先假定你可以在Pair[+T]定义
def replaceFirst(newFirst: T)
问题在于，该方法可能会被重写（以某种不可靠的方式）。
构造出这样的一个示例。
定义一个Pair[Double]的类型NastyDoublePair，重写replaceFirst方法，用newFirst的平方根来做新对偶。
然后对实际类型为NastyDoublePair的Pair[Any]调用replaceFirst("Hello")。
 */
//Any one resolve this, please contact me
package _1709 {

class Pair[+T](val t:T, val s:T) {
  def replaceFirst[T](newFirst: T) {}
}

class NastyDoublePair[Double](t1:Double, s1:Double) extends Pair[Double](t1,s1) {
  override def replaceFirst(newFirst: Double) ={
    /**
     *  error: type mismatch;
       found   : Double(in class NastyDoublePair)
       required: scala.Double
                 new NastyDoublePair(newFirst,math.sqrt(newFirst))
     */
    new NastyDoublePair(newFirst,math.sqrt(newFirst))
  }
}

object test extends App {
  val p: Pair[Any] = new NastyDoublePair(1.0, 2.0)
  p.replaceFirst("Hello")
}
}


