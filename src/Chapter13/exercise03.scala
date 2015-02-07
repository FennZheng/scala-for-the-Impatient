/**
 * 编写一个函数，从一个整型链表中去除所有的零值。
 */
def removeZero(list:List[Int]):List[Int]={
  list.filter(_!=0)
}
println(removeZero(List(3,25,0,2,0,0)))
