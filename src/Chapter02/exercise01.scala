/**
 * 一个数字如果为正数，则它的signum为1;如果是负数,则signum为-1;如果为0,则signum为0.编写一个函数来计算这个值。
 *
 */
def signum(n: BigInt) :Int = {
  if (n > 0) 1
  else if (n < 0) -1
  0
}

println(signum(1000000000000000));
println(signum(-1));
println(signum(0));