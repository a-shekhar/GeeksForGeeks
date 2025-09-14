class Solution {
    int majorityElement(int arr[]) {
        int candidate = -1;
        int count = 0;
        for(int num : arr){
           
            if(count == 0){
                candidate = num;
            }
            
            if(candidate == num){
                count++;
            }else{
                count--;
            }

            
           // System.out.println(count + " " + candidate);
        }

        // Phase 2: Verify candidate
        count = 0;
        
        for(int num : arr){
            if(num == candidate){
                count++;
            }
        }

        return count > arr.length / 2 ? candidate : -1;
    
    }
}