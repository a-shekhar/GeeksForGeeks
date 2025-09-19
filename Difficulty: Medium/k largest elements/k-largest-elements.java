class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int num: arr){
            queue.offer(num);
            if(queue.size() > k){
                queue.poll();
            }
        }
        
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(queue);

        while(!maxHeap.isEmpty()){
            result.add(maxHeap.poll());
        }

        return result;
    }
}
