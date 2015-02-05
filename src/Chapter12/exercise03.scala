/**
 * 用to和reduceLeft实现阶乘函数,不得使用循环或递归
 */
def factorial(n:Int): Unit ={
  1 to n reduceLeft(_ * _)
}