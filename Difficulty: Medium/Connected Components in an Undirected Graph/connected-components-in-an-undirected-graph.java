
class Solution {
     public ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            // unirected graph
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        Set<Integer> visited = new HashSet<>();
        
        for(int i = 0; i < V; i++){
                if(!visited.contains(i)){
                visited.add(i);
                res = new ArrayList<>();
                res.add(i);
                dfs(V, i, adj, visited, res, result);
                result.add(new ArrayList<>(res));
            }
        }
        return result;
    }

    private void dfs(int V, int point, ArrayList<ArrayList<Integer>> adj, Set<Integer> visited, ArrayList<Integer> res, ArrayList<ArrayList<Integer>> result) {
            
                for(int neigh : adj.get(point)){
                    if(!visited.contains(neigh)){
                        visited.add(neigh);
                        res.add(neigh);
                        dfs(V, neigh, adj, visited, res, result);
                    }
                }
                // add the path
    }
}