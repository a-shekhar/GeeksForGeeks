// User function Template for Java
import java.util.stream.IntStream;

class Solution {
    public static int findSum(int arr[], int N) {
        int min =  IntStream.range(0, arr.length).map(i -> arr[i]).min().getAsInt();
        int max = IntStream.range(0, arr.length).map(i -> arr[i]).max().getAsInt();
        //System.out.println(min + "  + max");
        return min + max;
    }
}
