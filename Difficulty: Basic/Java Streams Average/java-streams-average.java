// User function Template for Java
class Solution {
    public static double avgUsingStreams(int[] arr) {
        // Your code here
         return Arrays.stream(arr).average().getAsDouble();

        // Use stream().average().getAsDouble()
        // Just return and don't typecase anything.
    }
}