/**
 * 重复前一个练习，不过这一次生成一个新的值交换过的数组。用for/yield
 *
 */
def arrayChange(array: Array[Int]) :Array[Int] = {
  if(array == null)
    return null

  val length = array.length
  var flag = true
  val newArray = for(i <- 0 until length if flag) yield{
    var item = 0
    if(i+1 >= length){
      flag = false
    }
    if(i%2 == 0){
      item = array(i+1)
    }else if(i%2 == 1){
      item = array(i-1)
    }
    item
  }
  newArray.toArray
}
