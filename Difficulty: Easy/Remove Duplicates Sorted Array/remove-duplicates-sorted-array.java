import java.util.stream.Collectors;

class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        return Arrays.stream(arr).distinct()
        .boxed()
        .collect(Collectors.toCollection(ArrayList::new));
    }
}
