/**
 * 编写一个函数。将Double数组转换成二维数组。传入列数作为参数。
 * 举例来说，Array(1,2,3,4,5,6)和三列，返回Array(Array(1,2,3),Array(4,5,6))。
 * 用grouped方法。
 */
def divArr(arr:Array[Double],i:Int)={
  arr.grouped(i).toArray
}
val arr = Array(1.0,2,3,4,5,6)
divArr(arr,3).foreach(a => println(a.mkString(",")))
