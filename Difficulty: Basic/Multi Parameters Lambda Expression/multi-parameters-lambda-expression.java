// User function Template for Java

/*
The interface looks like

interface Add {
    public int addParameters(int a, int b);
}
*/

class Solution {
    public static Add helperFunction() {
        // Your code here
        Add add = (a, b) -> a + b;
        return add;

        // Implement the addParameters method that returns a+b.
    }
}