/**
 * 为RichFile类定义一个unapplySeq，提取所有路径段。
 * 举例来说，对于/home/cay/readme.txt，你应该产出三个路径段的序列:home,cay和readme.txt
 */
object RichFile {
  def unapplySeq(s: String): Option[Seq[String]] = {
    if (s.trim == "") None else Some(s.trim.split("/"))
  }
}