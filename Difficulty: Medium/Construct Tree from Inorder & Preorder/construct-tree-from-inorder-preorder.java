/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public static Node buildTree(int inorder[], int preorder[]) {

        Map<Integer, Integer> map = new HashMap<>(); //
        
         for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }
        
        return createTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, map);
    }

    private static Node createTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, Map<Integer, Integer> map) {
        if(preStart > preEnd || inStart > inEnd){
            return null;
        }

        int val = preorder[preStart];
        Node root = new Node(val);
        int inRoot = map.get(val);
        int size = inRoot - inStart;

        root.left = createTree(preorder, preStart + 1, preStart + size, inorder, inStart, inRoot - 1, map);
        root.right = createTree(preorder, preStart + size + 1, preEnd, inorder, inRoot + 1, inEnd, map);
        return root;
    }
}