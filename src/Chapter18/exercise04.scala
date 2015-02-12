/**
 * 实现18.2节中被嵌套在Network类中的Member类的equals方法。两个成员要想相等，必须属于同一个网络。
 */
import scala.collection.mutable.ArrayBuffer
class Network {
  class Member(val name: String) {
    val contacts = new ArrayBuffer[Member]

    def canEqual(other: Any): Boolean = other.isInstanceOf[Member]

    override def equals(other: Any): Boolean = other match {
      case that: Member =>
        (that canEqual this) &&
          name == that.name
      case _ => false
    }
  }
  private val members = new ArrayBuffer[Member]

  def join(name: String) = {
    val m = new Member(name)
    members += m
    m
  }

}
val network1 = new Network().join("1")
val network2 = new Network().join("1")
println(network1.equals(network2))

