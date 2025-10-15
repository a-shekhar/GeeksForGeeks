// User function Template for Java

class Solution {
    public int[] bellmanFord(int V, int[][] edges, int src) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[src] = 0;

        for(int i = 0; i < V; i++){
            for(int[] edge : edges){
                int u = edge[0];
                int v = edge[1];
                int w = edge[2];

                if(dist[u] == Integer.MAX_VALUE){
                    continue;
                }

                int newDistance = dist[u] + w;

                if(newDistance < dist[v]){
                    dist[v] = newDistance;
                }
            }
        }

        // cross verify 
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            if(dist[u] == Integer.MAX_VALUE){
                continue;
            }

            int newDistance = dist[u] + w;

            if(newDistance < dist[v]){
                return new int[]{-1};
            }
        }

        for(int i = 0; i < V; i++){
            if(dist[i] == Integer.MAX_VALUE){
                dist[i] = (int) Math.pow(10, 8);
            }
        }
        
        return dist;
        
    }
}
