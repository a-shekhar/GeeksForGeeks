import java.util.stream.Collectors;

class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        return Arrays.stream(arr).filter(n -> !seen.add(n))
                    .boxed()
                    .collect(Collectors.toCollection(ArrayList::new));
    }
}