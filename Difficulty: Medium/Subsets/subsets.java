class Solution {
     public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        findSubsets(0, arr.length-1, arr, res, result);
        return result;
    }

    private void findSubsets(int i, int n, int arr[], ArrayList<Integer> res, ArrayList<ArrayList<Integer>> result) {
        if(i > n){
            result.add(new ArrayList<>(res));
            return;
        }

        res.add(arr[i]);

        // keep adding (more children)
        findSubsets(i + 1, n, arr, res, result);

        // backtrack
        res.remove(res.size()-1);

        // keep adding (more children)
        
        findSubsets(i + 1, n, arr, res, result);

    }
}