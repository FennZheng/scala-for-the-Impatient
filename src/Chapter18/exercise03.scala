/**
 * 完成18.1节中的流利接口，以便我们可以做出如下调用：
    book set Title to "Scala for the Impatient" set Author to "Cay Horstmann"
 */
class Document {
  var title: String = ""
  var author: String = ""
  def setTitle(title: String):this.type = {this.title = title; this}
  def setAuthor(author: String):this.type = {this.author= author; this}
}
//可枚举
object Title
object Author

class Book extends Document{
  private var useNextArgAs:Any = null
  def set(obj: Any): this.type = {useNextArgAs = obj; this}
  def to(obj:String) = {
    useNextArgAs match{
      case Title => setTitle(obj)
      case Author => setAuthor(obj)
      case _ =>
    }
    this
  }
}
object Main extends App {
  val book = new Book
  book set Title to "Scala for the Impatient" set Author to "Cay Horstmann"
  println(book.title)
  println(book.author)
}