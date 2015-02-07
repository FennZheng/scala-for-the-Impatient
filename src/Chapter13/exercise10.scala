/**
 * Harry Hacker把文件读取到字符串中，然后想对字符串的不同部分用并行集合来并发地更新字母出现频率映射。他用了如下代码：
  val frequencies = new scala.collection.mutable.HashMap[Char,Int]
  for(c <- str.par) frequencies(c) = frequencies.getOrElse(c,0) + 1
  为什么说这个想法很糟糕？要真正地并行化这个计算，他应该怎么做呢？（提示：用aggregate） 并行修改共享变量，结果无法估计。
 */
import scala.collection.immutable.HashMap

val str = "abdcsdcd"
val frequencies = str.par.aggregate(HashMap[Char,Int]())(
  {
    (a,b) =>
      a + (b -> (a.getOrElse(b,0) + 1))
  }
  ,
  {
    (map1,map2) =>
      (map1.keySet ++ map2.keySet).foldLeft( HashMap[Char,Int]() ) {
        (result,k) =>
          result + ( k -> ( map1.getOrElse(k,0 ) + map2.getOrElse(k,0) ) )
      }
  }
)
