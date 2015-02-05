/**
 * 要得到一个序列的对偶很容易，比如:
    val pairs = (1 to 10) zip (11 to 20)

    假定你想要对这个序列做某中操作—比如，给对偶中的值求和，但是你不能直接使用:

    pairs.map(_ + _)

    函数_ + _ 接受两个Int作为参数，而不是(Int,Int)对偶。

  编写函数adjustToPair,
    该函数接受一个类型为(Int,Int)=>Int的函数作为参数，并返回一个等效的, 可以以对偶作为参数的函数。
    举例来说就是:adjustToPair(_ * _)((6,7))应得到42。然后用这个函数通过map计算出各个对偶的元素之和
 */
def ajustToPair(fun: (Int, Int) => Int) = (x: (Int, Int)) => fun(x._1, x._2)

val x = ajustToPair(_ * _)((6, 7))
println(x)

val pairs = (1 to 10) zip (11 to 20)
println(pairs)

val y = pairs.map(ajustToPair(_ + _))
println(y)