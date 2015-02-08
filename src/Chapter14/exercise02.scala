/**
 * 利用模式匹配，编写一个swap函数，接受一个整数的对偶，返回对偶的两个组成部件互换位置的新对偶
 */
def swap[S,T](tup: (S,T))={
  tup match{
    case (a,b) => (b,a)
  }
}
println(swap[String,Int](("1",2)))