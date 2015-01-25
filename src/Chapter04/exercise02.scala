
import scala.collection.mutable
import scala.io.Source

/**
 * 编写一段程序，从文件中读取单词。用一个可变映射来清点每个单词出现的频率。读取这些单词的操作可以使用java.util.Scanner
 *
 */
def countWord() : Unit = {
  val wordMap = new mutable.HashMap[String,Int]
  val in = new java.util.Scanner(new java.io.File("exercise02.txt"))
  while(in.hasNext){
    val word = in.next()
    wordMap(word) = wordMap.getOrElse(word,0) + 1
  }
  println(wordMap.mkString(","))
}

def countWord2() : Unit = {
  val source = Source.fromFile("exercise02.txt").mkString
  val tokens = source.split("\\s+")
  val wordMap = new mutable.HashMap[String,Int]
  for(word <- tokens){
    wordMap(word) = wordMap.getOrElse(word,0) + 1
  }
  println(wordMap.mkString(","))
}