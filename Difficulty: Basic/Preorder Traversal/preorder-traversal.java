class Solution {
     public ArrayList<Integer> preorder(Node root) {
        ArrayList<Integer> result = new ArrayList<Integer>(); 
        return traversal(root, result);
    }
    
    public ArrayList<Integer> traversal(Node root, ArrayList<Integer> result) {
        if(root == null){
            return result;
        }
        result.add(root.data);
        traversal(root.left, result);
        traversal(root.right, result);
        return result;
    }
}