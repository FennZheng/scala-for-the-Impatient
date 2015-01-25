/**
 * 编写一个函数Iteqgt(values:Array[int],v:Int),返回数组中小于v,等于v和大于v的数量，要求三个值一起返回
 */
def Iteqgt(values:Array[Int],v:Int){
  (values.count(_ < v),values.count(_ == v),values.count(_ > v))
}
