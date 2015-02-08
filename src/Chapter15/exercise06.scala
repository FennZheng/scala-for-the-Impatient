
/**
 * 编写一个Scala对象，该对象带有一个易失(volatile)的Boolean字段。
 * 让某一个线程睡眠一段时间，之后将该字段设为true，打印消息，然后退出。
 * 而另一个线程不停的检查该字段是否为true。
 * 如果是，它将打印一个消息并退出。
 * 如果不是，则它将短暂睡眠，然后重试。如果变量不是易失的，会发生什么？
 */
/***
import concurrent.ops.spawn
object Test06{
  @volatile var value = false
}

spawn {
  Thread.sleep(100);
  Test06.value = true
  println("Thread1: setting value to TRUE!")
}

spawn {
  while(!Test06.value) Thread.sleep(20);
  println("Thread2: value is TRUE!")
}
  **/