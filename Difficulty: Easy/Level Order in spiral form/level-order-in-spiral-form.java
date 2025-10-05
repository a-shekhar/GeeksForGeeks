/*
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
    public ArrayList<Integer> findSpiral(Node root) {
        Deque<Node> queue = new ArrayDeque<>();
        ArrayList<Integer>  result = new ArrayList<>();
        queue.offer(root);
        boolean leftToRight = false;
        ArrayList<Integer>  level = new ArrayList<>();

        

        while(!queue.isEmpty()){
            int size = queue.size();
            level = new ArrayList<>();
            for(int i = 0; i < size; i++){
                
            Node curr = queue.poll();

            if(curr.left != null){
                queue.offer(curr.left);
            }

            if(curr.right != null){
                queue.offer(curr.right);
            }
            
            if(leftToRight){
                level.add(curr.data);

            } else {
                level.add(0, curr.data);
            }

          } 
          leftToRight = !leftToRight;
          result.addAll(level);
        }

        return result;
    }
}