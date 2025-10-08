// User function Template for Java
class Solution {
    public boolean isTree(int n, int m, ArrayList<ArrayList<Integer>> edges) {
ArrayList<ArrayList<Integer>> neighbors = new ArrayList<>();
        
          // A tree with n nodes must have exactly n-1 edges
        if (m != n - 1) return false;
        
        for(int i = 0;  i < n; i++){
            neighbors.add(new ArrayList<>());
        }
        
        for(ArrayList<Integer> edge : edges){
            int u = edge.get(0);
            int v = edge.get(1);
            neighbors.get(u).add(v);
            neighbors.get(v).add(u); // undirected graph
        }

        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        visited.add(0);
        queue.offer(0);

        while(!queue.isEmpty()){
            int curr = queue.poll();
            for(int neigh : neighbors.get(curr)){
                if(!visited.contains(neigh)){
                    visited.add(neigh);
                    queue.offer(neigh);
                }
            }
        }

        return visited.size() == n;
        
    }
}
