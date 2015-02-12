/**
 * 实现一个方法，接受任何具备如下方法的类的对象和一个处理该对象的函数。
  调用该函数，并在完成或有任何异常发生时调用close方法。
  def close(): Unit
 */
def tryWithClose[T<:{def close():Unit}](obj:T,func: T => Unit)={
  try{
    func(obj)
  }finally {
    obj.close()
  }
}