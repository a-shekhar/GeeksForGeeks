class Solution {
    static String decToBinary(int n) {
        if(n == 0 || n == 1){
            return String.valueOf(n);
        }
        
        return  decToBinary(n / 2) + (n % 2);
    }
}