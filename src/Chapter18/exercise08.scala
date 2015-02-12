/**
 * 编写一个函数printValues，带有三个参数f、from和to，打印出所有给定区间范围内的输入值经过f计算后的结果。
 * 这里的f应>该是任何带有接受Int产出Int的apply方法的对象。例如：
    printValues((x: Int) => x*x, 3, 6) //将打印 9 16 25 36
    printValues(Array(1, 1, 2, 3, 5, 8, 13, 21, 34, 55), 3, 6) //将打印 3 5 8 13
 */
def printValues(f:{def apply(param:Int):Int}, from:Int, to:Int)={
  for(i <- from to to) {
    print(f.apply(i) + " ")
  }
}
printValues((x: Int) => x*x, 3, 6) //将打印 9 16 25 36
printValues(Array(1, 1, 2, 3, 5, 8, 13, 21, 34, 55), 3, 6) //将打印 3 5 8 13