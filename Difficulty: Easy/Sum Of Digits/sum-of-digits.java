class Solution {
    static int sumOfDigits(int n) {
        // code here
        if (n <= 9){
            return n;
        }
        
        return (n%10) + sumOfDigits(n/10);
    }
}
