import java.util
import scala.collection.mutable.Map
import scala.collection.JavaConversions.mapAsScalaMap
import scala.io.Source

/**
 * 重复前一个练习，这次使用java.util.TreeMap并使之适用于Scala API
 */
def countWord() : Unit = {
  val source = Source.fromFile("exercise02.txt").mkString
  val tokens = source.split("\\s+")
  var wordMap:Map[String,Int] = new util.TreeMap[String,Int]
  for(key <- tokens){
    wordMap += (key -> (wordMap.getOrElse(key,0) + 1))
  }
  println(wordMap.mkString(","))
}