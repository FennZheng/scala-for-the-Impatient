/**
 * 为前一个练习中的Bug类提供一个流利接口，达到能编写如下代码的效果：
    bugsy move 4 and show and then move 6 and show turn around move 5 and show
 */
package _1802 {
  //非动词 non-verb
object then
object show
object around
class Bug(var pos: Int = 0) {
  var forword: Int = 1

  def move(num: Int): this.type = { pos += num; this }
  def and(obj: then.type): this.type = this
  def and(obj: show.type): this.type = { print(pos + " "); this}
  def turn(obj: around.type): this.type = { pos = 0; this}
}
class Test extends App {
  val bugsy = new Bug
  bugsy move 4 and show and then move 6 and show turn around move 5 and show
}
}