import java.util.stream.Collectors;


class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        int[] freq = new int[arr.length+1];

        for(int num : arr){
            freq[num]++;
        }

      
        List<Integer> list = Arrays.stream(freq).boxed().collect(Collectors.toList());
        list.remove(0);
        return list;
    }
}
