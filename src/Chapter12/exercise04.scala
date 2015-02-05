/**
 * 前一个实现需要处理一个特殊情况，即n<1的情况。展示如何用foldLeft来避免这个需要。
 */
def factorial(n:Int) = (1 to n).foldLeft(1)(_ * _)

factorial(-3)
factorial(3)