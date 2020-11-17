import java.util.*;

public class BinaryTree {
  Node root;

  /* Driver program to test above functions */
  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();

    tree.root = new Node(3);
    tree.root.left = new Node(2);
    tree.root.right = new Node(5);
    tree.root.left.left = new Node(1);
    tree.root.left.right = new Node(4);
    tree.root.left.right.right=new Node(6);
    tree.root.left.right.right.right=new Node(7);
    System.out.println("Height of tree is : " + (tree.maxDepth(tree.root)-1));
  }

  /* Compute the "maxDepth" of a tree -- the number of
  nodes along the longest path from the root node
  down to the farthest leaf node.*/
  int maxDepth(Node node) {
    if (node == null) return 0;
    else {
      /* compute the depth of each subtree */
      int lDepth = maxDepth(node.left);
      int rDepth = maxDepth(node.right);
      System.out.println("lDepth "+lDepth);
      /* use the larger one */
      if (lDepth > rDepth) return (lDepth+1);
      else return (rDepth +1);
    }
  }
}
