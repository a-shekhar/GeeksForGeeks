class Solution {
   static int knapsack(int W, int val[], int wt[]) {
        int n = val.length;
        int[][] mat = new int[n+1][W+1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(mat[i], -1);
        }
        return  findMaxVal(W, val, wt, n, mat);
    }

    static int findMaxVal(int W, int val[], int wt[], int n, int[][] dp){
        if(n == 0 || W == 0){
            return 0;
        }

        if(dp[n][W] != -1){
            return dp[n][W];
        }

        if(wt[n-1] > W){
            dp[n][W] = findMaxVal(W, val, wt, n - 1, dp);
        } else{
            dp[n][W] = Math.max(val[n-1] + findMaxVal(W - wt[n-1], val, wt, n - 1, dp), findMaxVal(W, val, wt, n - 1, dp));
        }
        return dp[n][W];
    }
}
