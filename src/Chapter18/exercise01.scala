/**
 * 实现一个Bug类，对沿着水平线爬行的虫子建模。move方法向当前方向移动，turn方法让虫子转身，show方法打印出当前的位置。让这些方法可以被串接调用。
 * 例如：
    bugsy.move(4).show().move(6).show().turn().move(5).show()
  上述代码应显示4 10 5。
 */
package _1801 {

class Bug(var pos: Int = 0) {
  var forword: Int = 1

  def move(up: Int):this.type = {
    pos += forword * up
    this
  }

  def show():this.type = {
    print(pos + " ")
    this
  }

  def turn():this.type = {
    forword = -forword
    this
  }
}
 class Test extends App {
   val bugsy = new Bug
   bugsy.move(4).show().move(6).show().turn().move(5).show()
 }
}
