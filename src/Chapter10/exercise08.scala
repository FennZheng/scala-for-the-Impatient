/**
 * 在java.io类库中，你可以通过BufferedInputStream修饰器来给输入流增加缓冲机制。用特质来重新实现缓冲。简单起见，重写read方法
 */
import java.io.{InputStream, FileInputStream}


trait Buffering {
  this: InputStream =>

  val BUF_SIZE: Int = 5
  private val buf = new Array[Byte](BUF_SIZE)
  private var bufsize: Int = 0
  private var pos: Int = 0

  override def read(): Int = {
    if (pos >= bufsize) {
      bufsize = this.read(buf, 0, BUF_SIZE)
      if (bufsize > 0) -1
      pos = 0
    }
    pos += 1
    buf(pos-1)
  }
}

val f = new FileInputStream("exercise08.txt") with Buffering

for(i <- 1 to 10) println(f.read())
