import java.util.stream.Collectors;


class Solution {
    ArrayList<Integer> remDuplicate(int arr[]) {
        return Arrays.stream(arr).distinct()
           .boxed().collect(Collectors.toCollection(ArrayList::new));
        
    }
}