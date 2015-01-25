import scala.collection.JavaConversions.propertiesAsScalaMap
/**
 * 打印出所有Java系统属性的表格
 */
def printJavaSysProps():Unit = {
  val propMap:collection.Map[String,String] = System.getProperties()
  val maxKeyLength = propMap.keySet.map(_.length).max
  for( (k,v) <- propMap ) printf("%-" + maxKeyLength + "s | %s\n", k, v)
}
