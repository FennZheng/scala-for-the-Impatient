/**
 * 定义一个抽象类Item,加入方法price和description。
 * SimpleItem是一个在构造器中给出价格和描述的物件。
 * 利用val可以重写def这个事实。Bundle是一个可以包含其他物件的物件。
 * 其价格是打包中所有物件的价格之和。
 * 同时提供一个将物件添加到打包当中的机制，以及一个适合的description方法
 */
import collection.mutable.ArrayBuffer


abstract class Item{
  def price():Double
  def description():String

  override def toString():String={
    "description:" + description() + "  price:" + price()
  }
}

class SimpleItem(val price:Double,val description:String) extends Item{

}

class Bundle extends Item{

  val items = new ArrayBuffer[Item]()

  def addItem(item:Item){
    items += item
  }

  def price(): Double = {
    var total = 0d
    items.foreach(total += _.price())
    total
  }

  def description(): String = {
    items.mkString(" ")
  }
}
