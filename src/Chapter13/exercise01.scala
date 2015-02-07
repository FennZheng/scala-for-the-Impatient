/**
 * 编写一个函数，给定字符串，产出一个包含所有字符的下标的映射。
 * 举例来说：indexes("Mississippi")应返回一个映射，
 * 让'M'对应集{0}，'i'对应集{1,4,7,10}，依此类推。使用字符到可变集的映射。
 * 另外，你如何保证集是经过排序的？
 */
import scala.collection.SortedSet
import scala.collection.mutable.HashMap
def mapStrIndex(str:String)={
  var indexMap = new HashMap[Char,SortedSet[Int]]()
  var i = 0
  str.toCharArray.foreach {
    c =>
      indexMap.get(c) match {
        case Some(result) => indexMap(c) = result + i
        case None => indexMap += (c -> SortedSet {
          i
        })
      }
      i += 1
  }
  indexMap

}
println(mapStrIndex("Mississippi"))