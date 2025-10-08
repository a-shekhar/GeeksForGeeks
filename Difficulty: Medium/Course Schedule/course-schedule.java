class Solution {
    public static ArrayList<Integer> findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> neighbors = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0;  i < numCourses; i++){
            neighbors.add(new ArrayList<>());
        }

        int[] indegrees = new int[numCourses];
        
        for(int[] edge : prerequisites){
            int u = edge[0];
            int v = edge[1];
            indegrees[u]++;
            neighbors.get(v).add(u); // neighbors
        }

        Queue<Integer> queue = new LinkedList<>();
        
        for(int i = 0;  i < indegrees.length; i++){
            if(indegrees[i] == 0){
                queue.offer(i);
            }
        }

        while(!queue.isEmpty()){
            int curr = queue.poll();
            result.add(curr);
            for(int neigh : neighbors.get(curr)){
                if(--indegrees[neigh] == 0){
                    queue.offer(neigh);
                }
                
            }
        }

        return result;
        
    }
}