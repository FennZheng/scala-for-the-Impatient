/**
 * 扩展前一个练习中的树，使得每个节点可以有任意多的后代，并重新实现leafSum函数。第五题中的树应该能够通过下述代码表示：
    Node(Node(Leaf(3),Leaf(8)),Leaf(2),Node(Leaf(5)))
 */
sealed abstract class BinaryTree
case class Leaf(value: Int) extends BinaryTree
case class Node(tr: BinaryTree*) extends BinaryTree

def leafSum(tree:BinaryTree):Int={
  tree match {
    case Node(r @_*) => r.map(leafSum).sum
    case Leaf(v) => v
  }
}

val r = Node(Node(Leaf(3), Leaf(8)), Leaf(2), Node(Leaf(5)))

println(leafSum(r))

