
/**
 * 编写Scala程序，盘点给定目录及其子目录中总共有多少以.class为扩展名的文件
 */

def countClass(dir:java.io.File): Int = {
  var num:Int = 0
  val files = dir.listFiles()
  num += files.filter(_.isFile).count(_.getName.endsWith(".class"))
  files.filter(_.isDirectory).foreach(num += countClass(_))
  num
}

