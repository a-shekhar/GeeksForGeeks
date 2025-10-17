class Solution {
    int firstOccurence(String txt, String pat) {
        int index = 0;
        int ind = 0;
        int j = 0;

        while(j < txt.length()){
            
            index = 0;
            ind = j;
            
            while(txt.charAt(ind) == pat.charAt(index)){
                ind++;
                index++;
                if(index == pat.length()){
                    return j;
                }
            }
            
           
            j++;
            
        }

        return -1;
        
    }
}