/**
 * 修改前一个函数，返回最大的输出对应的输入。
 * 举例来说,largestAt(fun:(Int)=>Int,inputs:Seq[Int])应该返回5。不得使用循环或递归
 */
def largestAt1(fun:(Int)=>Int, inputs:Seq[Int]) = inputs.reduce((a,b)=> if(fun(b)>fun(a)) b else a)

def largestAt2(fun: (Int) => Int, inputs: Seq[Int]) = inputs.map(x => (x, fun(x))).reduceLeft((x,y) => if (x._2 > y._2) x else y)._1

println(largestAt1(x => 10 * x - x * x, 1 to 10))
println(largestAt2(x => 10 * x - x * x, 1 to 10))