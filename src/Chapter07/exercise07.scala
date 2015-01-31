/**
 * 在前一个练习中，将所有引入语句移动到尽可能小的作用域里
 */
object Q7 extends App{

  import java.util.{HashMap => JavaHashMap}

  val javaMap = new JavaHashMap[Int,String]

  javaMap.put(1, "One");
  javaMap.put(2, "Two");
  javaMap.put(3, "Three");
  javaMap.put(4, "Four");

  import collection.mutable.{HashMap => ScalaHashMap, Map => ScalaMap}

  val scalaMap = new ScalaHashMap[Int,String]

  for(key <- javaMap.keySet().toArray()){
    scalaMap += (key.asInstanceOf[Int] -> javaMap.get(key))
  }

  println(scalaMap.mkString(" "))
}