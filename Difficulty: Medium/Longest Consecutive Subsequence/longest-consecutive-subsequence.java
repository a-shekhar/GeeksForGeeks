class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        int maxCount = 0;
        Set<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }
        
        for(int num : arr){
            if(!set.contains(num-1)){
                int count = 0;
                while(set.contains(num)){
                    count++;
                    num++;
                    maxCount = Math.max(count, maxCount);
                }
            }
        }
        return maxCount;
    }
}