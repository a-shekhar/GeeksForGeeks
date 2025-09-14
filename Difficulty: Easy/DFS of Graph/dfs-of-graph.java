class Solution {
    // Function to return a list containing the DFS traversal of the graph.
   public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> result = new ArrayList<>();
        if (adj.isEmpty()) {
            return result;
        }
        
        Stack<Integer> stack = new Stack<>();
        Set<Integer> visited = new HashSet();
        visited.add(0);
        stack.push(0);

        dfsHelper(result, stack, visited, adj);

        return result;
    }

    private List<Integer> dfsHelper(ArrayList<Integer> result, Stack<Integer> stack, Set<Integer> visited, ArrayList<ArrayList<Integer>> adj){
        if(stack.isEmpty()){
            return result;
        }
        int popped = stack.pop();
        result.add(popped);
        for(Integer neighbor : adj.get(popped)){
            if(!visited.contains(neighbor)){
                visited.add(neighbor);
                stack.push(neighbor);
                dfsHelper(result, stack, visited, adj);
            }
        }

        return result;
    }
}