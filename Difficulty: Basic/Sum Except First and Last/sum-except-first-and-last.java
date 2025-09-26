import java.util.stream.IntStream;

class Solution {
    int sumExceptFirstLast(int[] arr) {
        // your code here
        return IntStream.range(0, arr.length-1).skip(1)
            .map(i -> arr[i]).sum();
    }
}