class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> result = new ArrayList<>();
        if(adj.isEmpty()){
            return result;
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        Set<Integer> visited = new HashSet();
        visited.add(0);
        
        while(!queue.isEmpty()){
            Integer temp = queue.poll();
            
            result.add(temp);
            for(Integer neighbor : adj.get(temp)){
                if(!visited.contains(neighbor)){
                    queue.offer(neighbor);
                    visited.add(neighbor);
                }
            }
        }
        
        return  result;
    }
}