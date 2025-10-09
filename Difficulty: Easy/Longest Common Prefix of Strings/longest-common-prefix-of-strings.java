// User function Template for Java
class Solution {
    public String longestCommonPrefix(String arr[]) {
        String prefix = arr[0];
        int n = arr.length;

        for(int i = 1;  i < n; i++){
            while(!arr[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
}