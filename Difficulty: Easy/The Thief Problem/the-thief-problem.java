// User function Template for Java

class Solution {
    public static int getMaxVal(int arr[], int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int moneySum = 0;
        for(int money : arr){
            minHeap.offer(money);
            if(minHeap.size() > k){
                 minHeap.poll();
            }
        }

        while(!minHeap.isEmpty()){
            moneySum += minHeap.poll();
        }
        return moneySum;
    }
}