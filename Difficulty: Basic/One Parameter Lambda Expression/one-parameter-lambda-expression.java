// User function Template for Java

/*
The interface looks like

interface Multiply {
    public int multiplyBy5(int n);
}
*/

class Solution {

    public static Multiply helperFunction() {
        // Your code here
        Multiply multiply = (n) -> n = n * 5;
        
        return multiply;
        

        // Implement the multiplyBy5(int n) method using lambda expression. The
        // implemented function should return n*5
    }
}