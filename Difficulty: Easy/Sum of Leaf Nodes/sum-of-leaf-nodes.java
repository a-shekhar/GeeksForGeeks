/*
// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    // Function to return sum of all nodes of a binary tree
    static int leafSum(Node root) {
        return inOrder(root);
    }

    private static int inOrder(Node root){
        if(root == null){
            return 0;
        }

        if(root.left == null && root.right == null){
            return root.data;
        }

        return inOrder(root.left) + inOrder(root.right);
    }
}