// User function Template for Java

class Solution {
     public static int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);

        for(int num : arr){
            pq.offer(num);
            if(pq.size() > k){
                pq.poll();
            }
        }

        return pq.poll();
    }
}
