/**
 * 在12.8节中，你看到了用于两组字符串数组的corresponds方法。
 * 做出一个对该方法的调用，让它帮我们判断某个字符串数组里的所有元素的长度是否和某个给定的整数数组相对应
 */
val a = Array("asd","df","abcd")
val b = Array(3,2,4)
val c = Array(3,2,1)

println(a.corresponds(b)(_.length == _))
println(a.corresponds(c)(_.length == _))