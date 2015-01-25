/**
 * 设置一个映射,其中包含你想要的一些装备，以及它们的价格。然后构建另一个映射，采用同一组键，但是价格上打9折
 *
 */
def buildEquipMap() :Map[String,Double] = {
  val equipMap:Map[String,Double] = Map("eq1"->11.1,"eq2"->12.2,"eq3"->14)
  for ((k,v) <- equipMap) yield (k,v*0.9)
}