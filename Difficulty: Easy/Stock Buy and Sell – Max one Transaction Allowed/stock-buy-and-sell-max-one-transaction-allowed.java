// User function Template for Java

class Solution {
    public int maximumProfit(int prices[]) {
        int maxProfit = Integer.MIN_VALUE;
        int minPrice = Integer.MAX_VALUE;
        for(int price : prices){
            minPrice = Math.min(price, minPrice);
            maxProfit = Math.max(price - minPrice, maxProfit);
        }
        if(maxProfit < 0) return 0;
        return maxProfit;
    }
}