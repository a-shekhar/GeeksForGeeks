// User function Template for Java
class Solution {
    String transform(String S) {
        int count = 1;
        String s = S.toLowerCase();
        StringBuilder builder = new StringBuilder();

        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(i-1)){
                builder.append(count).append(s.charAt(i-1));
                count = 1;
            } else {
                count++;
            }
        }
        // append last one
        builder.append(count).append(s.charAt(s.length()-1));
        return builder.toString();
    }
}