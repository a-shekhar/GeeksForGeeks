// User function Template for Java
class Solution {
    public static int filterUsingStreams(int[] arr) {
        // Your code here
        OptionalInt maxOptional = Arrays.stream(arr).filter(num -> num % 2 == 1).max();
        return maxOptional.getAsInt();

        // Use filter() to get only odd elements then apply max().getAsInt()
    }
}