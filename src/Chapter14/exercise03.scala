/**
 * 利用模式匹配，编写一个swap函数，交换数组中的前两个元素的位置，前提条件是数组长度至少为2
 */
def swap(array:Array[Any])={
  array match{
    case Array(first,second,rest @_*)=> Array(second,first)++rest
    case _ => array
  }
}
println(swap(Array("1","2","3","4")).mkString)
