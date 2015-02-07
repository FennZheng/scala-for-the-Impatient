/**
 * 编写一个函数，接受一个字符串的集合，以及一个从字符串到整数值的映射。
 * 返回整型的集合，其值为能和集合中某个字符串相对应的映射的值。
 * 举例来说，给定Array("Tom","Fred","Harry")和Map("Tom"->3,"Dick"->4,"Harry"->5)，返回Array(3,5)。
 * 提示：用flatMap将get返回的Option值组合在一起
 */
def filterMap(array:Array[String],map:Map[String,Int]):Array[Int]={
  array.flatMap(map.get(_))
}
println(filterMap(Array("Tom","Fred","Harry"),Map("Tom"->3,"Dick"->4,"Harry"->5)).mkString(","))