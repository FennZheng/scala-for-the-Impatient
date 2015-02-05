/**
 * 编写函数largest(fun:(Int)=>Int,inputs:Seq[Int]),
 * 输出在给定输入序列中给定函数的最大值。
 * 举例来说，largest(x=>10*x-x*x,1 to 10)应该返回25.不得使用循环或递归
 */
def largest1(fun:(Int)=>Int, inputs:Seq[Int]) = inputs.foldLeft(1)((a,b)=> if(fun(b)>a) fun(b) else a)

def largest2(fun:(Int)=>Int, inputs:Seq[Int]) = inputs.map(fun(_)).max

println(largest1(x => 10 * x - x * x, 1 to 10))
println(largest2(x => 10 * x - x * x, 1 to 10))
