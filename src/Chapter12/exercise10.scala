/**
 * 实现一个unless控制抽象，工作机制类似if,但条件是反过来的。第一个参数需要是换名调用的参数吗？你需要柯里化吗？
 */
def unless(condition: => Boolean)(block: => Unit) { if (!condition) { block } }

unless (0 > 1) { println("Unless!") }