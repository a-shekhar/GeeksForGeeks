// User function Template for Java
class Solution {
    public String longestCommonPrefix(String arr[]) {
        String prefix = arr[0];
        String word;

        for(int i = 1; i < arr.length; i++){
            word = arr[i];
            for(int j = 0; j < word.length() && j < prefix.length(); j++){
                if(prefix.charAt(j) != word.charAt(j)){
                    prefix = word.substring(0, j);
                }
            }
        }
        return prefix;
    }
}