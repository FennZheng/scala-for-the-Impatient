/**
 * 创建一个类的示例，展示注解可以出现的所有位置。用@deprecated作为你的示例注解。
 */
@deprecated
class Test{

  @deprecated
  val t = _;

  @deprecated(message = "unuse")
  def hello(){
    println("hello")
  }
}

@deprecated
object Test extends App{
  val t = new Test()
  t.hello()
  t.t
}
