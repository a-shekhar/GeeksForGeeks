class Solution {
    public ArrayList<Integer> topKFrequent(int[] arr, int k) {
       ArrayList<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int maxfreq = 0;
        
        for(int num : arr){
            int val = map.getOrDefault(num, 0) + 1;
            maxfreq = Math.max(maxfreq, val);
            map.put(num, val);
        }

       PriorityQueue<Integer>[] freqArr = new PriorityQueue[maxfreq+1];

       for (int i = 0; i <= maxfreq; i++) {
        freqArr[i] = new PriorityQueue<>((a, b) -> b - a); // descending order PQ
       }

       for(int key : map.keySet()){    
           freqArr[map.get(key)].offer(key); // add number in frquency
       }

       
       while(k > 0){
           while(!freqArr[maxfreq].isEmpty()){
                result.add(freqArr[maxfreq].poll());
                k--;
                if(k == 0){
                    break;
                }
           }
           maxfreq--;
       }

        return result;
        
    }
}
