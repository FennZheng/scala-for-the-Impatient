/**
 * Scala类库中的Either类型可以被用于要么返回结果，要么返回某种失败信息的算法。
 * 编写一个带有两个参数的函数：一个已排序整数数组和一个整数值。
 * 要么返回该整数值在数组中的下标，要么返回最接近该值的元素的下标。
 * 使用一个中置类型作为返>回类型。
 */
def getIndex(arr: Seq[Int], v: Int): Int Either Int = {
  if (arr.contains(v)) {
    Left(arr.indexOf(v))
  } else {
    Right(arr.indexOf(arr.reduce((a,b) => if (math.abs(v - a) > math.abs(v - b)) b else a)))
  }
}
println(getIndex(Seq(2,3,4,5,-2,-3),1))