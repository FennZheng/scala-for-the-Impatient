/**
 * 制作这样的树更好的做法是使用样例类。我们不妨从二叉树开始。
    sealed abstract class BinaryTree
    case class Leaf(value : Int) extends BinaryTree
    case class Node(left : BinaryTree,right : BinaryTree) extends BinaryTree
    编写一个函数计算所有叶子节点中的元素之和。
 */
sealed abstract class BinaryTree
case class Leaf(value : Int) extends BinaryTree
case class Node(left: BinaryTree, right:BinaryTree) extends BinaryTree

def leafSum(tree:BinaryTree):Int={
  tree match {
    case Node(a,b) => leafSum(a) + leafSum(b)
    case Leaf(v) => v
  }
}

val r = Node(Leaf(3),Node(Leaf(3),Leaf(9)))

println(leafSum(r))
