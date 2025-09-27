// User function Template for Java

class Solution {
    static double switchCase(int choice, List<Double> arr) {
        // code here
         double result = switch (choice){
            case 1 -> Math.PI * arr.get(0) * arr.get(0);
            case 2 -> arr.get(0) * arr.get(1);
            default -> -1;
        };
        return result;
    }
}