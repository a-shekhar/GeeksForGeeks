import java.util.stream.IntStream;

class Solution {
  
    public int search(int arr[], int x) {
        // code here
        return IntStream.range(0, arr.length).filter(i -> arr[i] == x).findFirst().orElse(-1);

    }
}
