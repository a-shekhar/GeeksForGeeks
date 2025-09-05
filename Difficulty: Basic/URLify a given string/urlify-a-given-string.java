// User function Template for Java
class Solution {
    String URLify(String s) {
       StringBuilder builder = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                builder.append("%20");
            }else{
                builder.append(s.charAt(i));
            }
        }
        return builder.toString();
    }
}