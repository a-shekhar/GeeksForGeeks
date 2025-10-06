class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        int i = 0;
        int j = 0;
        while(j - i + 1 <= k){
            sum += arr[j];
            maxSum = Math.max(sum, maxSum);
            j++;
        }

        while(j < arr.length){
            sum -= arr[i];
            sum += arr[j];
            i++;
            j++;
            maxSum = Math.max(sum, maxSum);
        }
        
        //System.out.println(j);
        return maxSum;
    }
}