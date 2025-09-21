class Solution {
    public int celebrity(int mat[][]) {
        // code here
        int n = mat.length;
        int[] arr = new int[n]; 
        for(int i = 0; i < n; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(i != j && mat[i][j] == 1){
                    arr[i]--;
                    arr[j]++;
                }
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == n-1){
                return i;
            }
        }

        return -1;
    }
}