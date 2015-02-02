/**
 * 实现一个IterableInputStream类，扩展java.io.InputStream并混入Iterable[Byte]特质
 */
class IterableInputStream extends java.io.InputStream with Iterable[Byte]{
  class InputStreamIterator(outer: IterableInputStream) extends Iterator[Byte] {
    def hasNext: Boolean = outer.available() > 0
    def next: Byte = outer.read().toByte
  }

  override def iterator: Iterator[Byte] = new InputStreamIterator(this)
  override def read(): Int = 0

}
