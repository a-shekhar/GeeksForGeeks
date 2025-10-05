class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
        Boolean[][] dp = new Boolean[arr.length][sum+1];
        // for(int i = 0; i <= arr.length; i++){
        //     for(int j = 0; j <= sum; j++){
        //         if(i == 0){
        //             dp[i][j] = true;
        //         }
        //     }
        // }
        return findAns(arr, arr.length - 1, sum, dp);
    }

    static Boolean findAns(int arr[], int index, int target, Boolean[][] dp){
        if(target == 0){
            return true;
        }

        if(index < 0){
            return false;
        }

        if(dp[index][target] != null){
            return dp[index][target];
        }

        boolean include = false;

        if(arr[index] <= target){
            include = findAns(arr, index - 1, target - arr[index], dp);
        }

        boolean exclude = findAns(arr, index - 1, target, dp);

        dp[index][target] = (include || exclude);
        
        return dp[index][target];
    }
}