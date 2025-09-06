class Solution {
    int maxSubarraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int num : arr){
            currSum = Math.max(num , num + currSum);
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
        
    }
}
