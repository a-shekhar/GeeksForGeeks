class Solution {
    // Function to count paths between two vertices in a directed graph.
    public int countPaths(int V, ArrayList<ArrayList<Integer>> adj, int source,
    int destination) {
          
      return dfs(source, destination, 0, adj);
    }

    private int dfs(int source, int destination, int count, ArrayList<ArrayList<Integer>> adj) {
        if(source == destination){
            return 1;
        }

        for(int neigh : adj.get(source)){
            count += dfs(neigh, destination, 0, adj); // add paths from neighbors
        }

        return count;
    }
}