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
    public Node insert(Node root, int key) {
        if(root == null){
            return new Node(key);
        }
        
        Node curr = root;
        
        findCeilNode(curr, key);
        
        
        return root;
    }
    
    private static Node findCeilNode(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        
        if(root.data == val){
            return root;
        }
        
        if(root.data > val){
            root.left = findCeilNode(root.left, val);
        } else {
            root.right = findCeilNode(root.right, val);
        }
        
        return root;
    }
}
