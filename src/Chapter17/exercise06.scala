/**
 * 编写一个泛型方法middle，返回任何Iterable[T]的中间元素。举例来说，middle("World")应得到'r'。
 */
def middle[T](iter:Iterable[T]):T={
  val seq = iter.toArray
  seq(seq.length/2)
}
