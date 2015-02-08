/**
 * 扩展前一个练习中的树，使得每个非叶子节点除了后代之外，能够存放一个操作符。然后编写一个eval函数来计算它的值。举例来说：
        +
      / | \
     *  2  -
   /  \    |
  3   8    5
  上面这棵树的值为(3 * 8) + 2 + (-5) = 21
 */
sealed abstract class BinaryTree
case class Leaf(value: Int) extends BinaryTree
case class Node(op: Char, leafs: BinaryTree*) extends BinaryTree

def eval(tree:BinaryTree):Int= {
  tree match {
    case Node(op, leafs@_*) => op match {
      case '+' => leafs.map(eval _).sum
      case '-' => -leafs.map(eval _).sum
      case '*' => leafs.map(eval _).product
    }
    case Leaf(x) => x
  }
}

  val x = Node('+', Node('*', Leaf(3), Leaf(8)), Leaf(2),  Node('-', Leaf(5)))

  println(x)
  println(eval(x))
