import scala.collection.immutable.TreeMap
import scala.io.Source

/**
 * 重复前一个练习，这次使用已排序的映射，以便单词可以按顺序打印出来
 */
def countWord() : Unit = {
  val source = Source.fromFile("exercise02.txt").mkString
  val tokens = source.split("\\s+")
  var wordMap = new TreeMap[String,Int]
  for(key <- tokens){
    wordMap += (key -> (wordMap.getOrElse(key,0) + 1))
  }
  println(wordMap.mkString(","))
}