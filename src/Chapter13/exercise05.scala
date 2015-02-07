/**
 * 实现一个函数，作用与mkString相同，使用reduceLeft。
 */
import collection.mutable

trait MktString{
  this:mutable.Iterable[String]=>
  def mktString(split:String="") = if( this != Nil) this.reduceLeft(_ + split + _)
}

var test = new mutable.HashSet[String] with MktString
test += "1"
test += "2"
test += "3"
println(test.mktString(","))
