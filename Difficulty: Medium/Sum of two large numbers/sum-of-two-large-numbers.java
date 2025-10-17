// User function Template for Java

class Solution {
    String findSum(String s1, String s2) {
       int s1Len = s1.length();
        int s2Len = s2.length();
        int i = s1Len - 1;
        int j = s2Len - 1;
        int carry = 0;
        StringBuilder builder = new StringBuilder();

        while(i >= 0 || j >= 0 || carry != 0){
            int a = i >= 0 ? Integer.valueOf(s1.charAt(i) - '0') : 0;
            int b = j >= 0 ? Integer.valueOf(s2.charAt(j) - '0') : 0;
            int sum =  a + b + carry;
            builder.append(sum % 10);
            carry = sum /10;
            i--;
            j--;
        }
        
        i = builder.length() - 1;

        while(i > 0 && builder.charAt(i) == '0'){
            builder.deleteCharAt(i);
            i--;
        }

        return builder.reverse().toString();
    }
}