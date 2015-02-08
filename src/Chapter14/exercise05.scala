/**
 * 我们可以用列表制作只在叶子节点存放值的树。举例来说，列表((3 8) 2 (5))描述的是如下这样一棵树:
 *
  / | \
   *  2  *
   /  \    |
  3   8    5
  不过，有些列表元素是数字，而另一些是列表。在Scala中，你不能拥有异构的列表，因此你必须使用List[Any]。
  编写一个leafSum函数，计算所有叶子节点中的元素之和，用模式匹配来区分数字和列表。
 */
def leafSum(list:List[Any]):Int={
  var total = 0
  list.foreach {
    lst =>
      lst match {
        case l: List[Any] => total += leafSum(l)
        case i: Int => total += i
      }
  }
  total
}
val l: List[Any] = List(List(3, 8), 2, List(5))

println(leafSum(l))