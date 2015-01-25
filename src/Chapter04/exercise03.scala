import scala.collection.{mutable, immutable}
import scala.io.Source

/**
 * 重复前一个练习，这次用不可变的映射
 *
 */
def countWord() : Unit = {
  val source = Source.fromFile("exercise02.txt").mkString
  val tokens = source.split("\\s+")
  var wordMap = new immutable.HashMap[String,Int]
  for(key <- tokens){
    wordMap += (key -> (wordMap.getOrElse(key,0) + 1))
  }
  println(wordMap.mkString(","))
}

/**
 * 书中:immutable map += 不断生成新的map，由于都是immutable，共享大部分数据结构，
 * 测试下性能
 */
def countWord1(tokens:Array[String]) : Unit = {
  val wordMap = new mutable.HashMap[String,Int]
  for(word <- tokens){
    wordMap(word) = wordMap.getOrElse(word,0) + 1
  }
}

def countWord2(tokens:Array[String]) : Unit = {
  val wordMap = new mutable.HashMap[String,Int]
  for(word <- tokens){
    wordMap(word) = wordMap.getOrElse(word,0) + 1
  }
}

def performance():Unit={
  val source = Source.fromFile("exercise02.txt").mkString
  val tokens = source.split("\\s+")
  val startTime1 = System.currentTimeMillis()
  for(i <- 0 to 10000) {
    countWord1(tokens)
  }
  val endTime1 = System.currentTimeMillis()
  val startTime2 = System.currentTimeMillis()
  for(i <- 0 to 10000) {
    countWord2(tokens)
  }
  val endTime2 = System.currentTimeMillis()
  println("countWord1(mutable map) cost:"+(endTime1-startTime1))
  println("countWord2(immutable map) cost:"+(endTime2-startTime2))

  /**
   * scala> performance
countWord1(mutable map) cost:36
countWord2(immutable map) cost:34

scala> performance
countWord1(mutable map) cost:4
countWord2(immutable map) cost:4

scala> performance
countWord1(mutable map) cost:8
countWord2(immutable map) cost:6

scala> performance
countWord1(mutable map) cost:4
countWord2(immutable map) cost:8

scala> performance
countWord1(mutable map) cost:5
countWord2(immutable map) cost:4
   */
}