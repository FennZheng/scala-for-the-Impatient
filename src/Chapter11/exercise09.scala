/**
 * 为RichFile类定义unapply操作，提取文件路径，名称和扩展名。
 * 举例来说，文件/home/cay/readme.txt的路径为/home/cay,名称为readme,扩展名为txt
 */
class RichFile(val path:String) extends java.io.File(path){

}
object RichFile{
  def unapply(richFile:RichFile): Unit ={
    val path = richFile.path
    val pos = path.lastIndexOf("/")
    if (pos == -1) None else Some((path.substring(0, pos), path.substring(pos + 1)))
  }
}