import scala.collection.mutable.ArrayBuffer

/**
 * 给定一个整数数组，产生一个新的数组，包含元数组中的所有正值，以原有顺序排列，之后的元素是所有零或负值，以原有顺序排列
 */
def sortArray(array:Array[Int]):Array[Int] = {
  val newArrayBuffer = new ArrayBuffer[Int]()
  val positiveIndex = for(i <- 0 to array.length if array(i) > 0 ) yield {array(i)}
  newArrayBuffer ++= positiveIndex.toBuffer
  newArrayBuffer ++= (for(i <- 0 to array.length if !positiveIndex.contains(i)) yield{array(i)}).toBuffer
  newArrayBuffer.toArray
}

def sortArray2(array:Array[Int]):Array[Int] = {
  val a = ArrayBuffer[Int]()
  val b = ArrayBuffer[Int]()
  array.foreach(arg => if(arg > 0) a += arg else b += arg)
  a ++= b
  a.toArray
}

def sortArray3(array:Array[Int]):Array[Int] = {
  val a = array.filter(_>0).map(_*1)
  val b = array.filter(_<=0).map(_*1)
  var c = a.toBuffer
  c ++= b.toBuffer
  c.toArray
}