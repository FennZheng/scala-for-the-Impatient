/**
 * 在13.11节中，表达式(prices zip quantities) map { p => p._1 * p._2}有些不够优雅。
 * 我们不能用(prices zip quantities) map { _ * _}，
 * 因为 _ * _ 是一个带两个参数的函数，
 * 而我们需要的是一个带单个类型为元组的参数的函数，
 * Function对象的tupled方法可以将带两个参数的函数改为以元组为参数的函数。
 * 将tupled应用于乘法函数，以使我们可以用它来映射由对偶组成的列表。
 */
val prices = List(5.0,20.0,9.95)
val quantities = List(10,2,1)
println((prices zip quantities) map { Function.tupled(_ * _) })
