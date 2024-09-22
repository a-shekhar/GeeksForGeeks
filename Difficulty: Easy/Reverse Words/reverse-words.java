//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        StringBuilder sb = new StringBuilder();
        String[] words = str.split("\\.")  ;
        //System.out.println(Arrays.toString(words));
        for(int i = words.length-1; i >=0 ; i--){
            sb.append(words[i]).append(".");
        }
        return sb.toString().substring(0, sb.length()-1);
    }
}