class Solution {
    public static boolean areAnagrams(String str1, String str2) {
        if(str1.length() != str2.length()){
            return false;
        }
        
        int[] arr = new int[26];
        int val1, val2;
        for(int i = 0; i < str1.length(); i++){
            val1 = str1.charAt(i) - 'a';
            val2 = str2.charAt(i) - 'a';
            arr[val1]++;
            arr[val2]--;
        }

        for(int i = 0; i < 26; i++){
            if(arr[i] != 0){
                return false;
            }
        }

        return true;
    }
}