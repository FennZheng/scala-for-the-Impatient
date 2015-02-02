/**
 *市面上有不下数十种关于Scala特质的教程,用的都是些"在叫的狗"啦，"讲哲学的青蛙"啦之类的傻乎乎的例子。
 * 阅读和理解这些机巧的继承层级很乏味且对于理解问题没什么帮助,但自己设计一套继承层级就不同了,会很有启发。
 * 做一个你自己的关于特质的继承层级，要求体现出叠加在一起的特质,具体的和抽象的方法，以及具体的和抽象的字段
 */
trait Fly{
  def fly(){
    println("flying")
  }

  def flywithnowing()
}

trait Walk{
  def walk(){
    println("walk")
  }
}

class Bird{
  var name:String = _
}

class BlueBird extends Bird with Fly with Walk{
  def flywithnowing() {
    println("BlueBird flywithnowing")
  }
}

object Test extends App{
  val b = new BlueBird()
  b.walk()
  b.flywithnowing()
  b.fly()
}