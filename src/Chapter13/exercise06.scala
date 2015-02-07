/**
 * 给定整型列表lst,(lst :\ List[Int]())(_ :: _ )得到什么?
 * (List[Int]() /: lst)(_ :+ _)又得到什么？
 * 如何修改它们中的一个，以对原列表进行反向排序？
 */
val lst = List(1,2,3,4,5)
println((lst :\ List[Int]())(_ :: _))
println((List[Int]() /: lst)(_ :+ _))
println((List[Int]() /: lst)((a,b) => b :: a))