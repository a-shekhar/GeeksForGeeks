// User function Template for Java
import java.util.stream.IntStream;

class Solution {
    int sumOfSeries(int n) {
        // code here
        return (int) IntStream.rangeClosed(1, n).mapToDouble(num -> Math.pow(num, 3)).sum();

    }
}