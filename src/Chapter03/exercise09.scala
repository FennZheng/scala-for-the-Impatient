/**
 * 创建一个由java.util.TimeZone.getAvailableIDs返回ide时区集合，判断条件是它们在美洲。去掉"America/"前缀并排序
 */
def sortAmericaTimeZone():Unit = {
  val array = java.util.TimeZone.getAvailableIDs
  val result = array.filter(_.startsWith("America")).map(_.replace("America/","")).sorted
  result.foreach(println(_))
}
