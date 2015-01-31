/**
 * 编写一段程序,将Java哈希映射中的所有元素拷贝到Scala哈希映射。用引入语句重命名这两个类。
 */
object Q6 extends App{

  import java.util.{HashMap => JavaHashMap}
  import collection.mutable.{HashMap => ScalaHashMap, Map => ScalaMap}

  val javaMap = new JavaHashMap[Int,String]

  javaMap.put(1, "One");
  javaMap.put(2, "Two");
  javaMap.put(3, "Three");
  javaMap.put(4, "Four");

  val scalaMap = new ScalaHashMap[Int,String]

  for(key <- javaMap.keySet().toArray()){
    scalaMap += (key.asInstanceOf[Int] -> javaMap.get(key))
  }

  println(scalaMap.mkString(" "))
}