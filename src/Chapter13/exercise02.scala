/**
 * 重复前一个练习，这次用字符到列表的不可变映射。
 */
import scala.collection.mutable.{ListBuffer, HashMap}
def mapStrIndex(str:String)={
  var indexMap = new HashMap[Char,ListBuffer[Int]]()
  var i = 0
  str.toCharArray.foreach {
    c =>
      indexMap.get(c) match {
        case Some(result) => result += i
        case None => indexMap += (c -> ListBuffer {
          i
        })
      }
      i += 1
  }
  indexMap

}
println(mapStrIndex("Mississippi"))