
/**
 * 重新编写3.4节结尾的示例。收集负值元素的下标，反序，去掉最后一个下标，然后对每个下标调用a.remove(i)。
 * 比较这样做的效率和3.4节中另外两种方法的效率
 */
def removeArray1(arr:Array[Int]):Array[Int]={
  val t = arr.toBuffer
  val idx =(for(i <- 0 until t.length if t(i) < 0) yield { i }).reverse.toBuffer
  idx.trimEnd(1)
  idx.foreach(arg => t.remove(arg))
  t.toArray
}

def removeArray2(array:Array[Int]):Array[Int]={
  val arr = array.toBuffer
  var first = true
  val indexes = for(i <- 0 until arr.length if first || arr(i) >= 0) yield{
    if(arr(i) < 0) first = false;i
  }
  for(j <- 0 until indexes.length) arr(j) = arr(indexes(j))
  arr.trimEnd(arr.length - indexes.length)
  arr.toArray
}

def performance():Unit={
  val array = Array(1,-2,3,55,3,-4,-6,-2,-1,55,-3,5)
  val startTime1 = System.currentTimeMillis()
  for(i <- 0 to 10000) {
    removeArray1(array)
  }
  val endTime1 = System.currentTimeMillis()
  val startTime2 = System.currentTimeMillis()
  for(i <- 0 to 10000) {
    removeArray2(array)
  }
  val endTime2 = System.currentTimeMillis()
  println("removeArray1 cost:"+(endTime1-startTime1))
  println("removeArray2 cost:"+(endTime2-startTime2))
  //10000次 201：81
}