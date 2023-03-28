/**
 * 编写一个循环，将整数数组中相邻的元素置换。例如,Array(1,2,3,4,5)经过置换后变为Array(2,1,4,3,5)
 *
 */
def arrayChange(array: Array[Int]) :Array[Int] = {
  if(array == null)
    return null

  for(i <- 0 until array.length if i % 2 != 0 && i > 0){
    val tmp = array(i-1)
    array(i-1) = array(i)
    array(i) = tmp
  }
  array
}

def arrayChange2(arr: Array[Int]) :Array[Int] = {
  val t = arr.toBuffer
  for(i <- 0 until (t.length,2) if i + 1 < t.length){
    val a = t(i)
    val b = t(i + 1)
    t.remove(i,2)
    t.insert(i,b)
    t.insert(i + 1,a)
  }
  t.toArray
}