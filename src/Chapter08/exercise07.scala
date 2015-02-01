/**
 * 提供一个Square类，扩展自java.awt.Rectangle并且是三个构造器：
 * 一个以给定的端点和宽度构造正方形，
 * 一个以(0,0)为端点和给定的宽度构造正方形，
 * 一个以(0,0)为端点,0为宽度构造正方形
 */
import java.awt.{Point, Rectangle}

class Square(point:Point,width:Int) extends Rectangle(point.x,point.y,width,width){

  def this(){
    this(new Point(0,0),0)
  }

  def this(width:Int){
    this(new Point(0,0),width)
  }
}