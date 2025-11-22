import java.util.function.Function;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;
class Solution {
     public char getMaxOccuringChar(String s) {
        Map<Character, Long> mapCount = s.chars().mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy
            (Function.identity(), HashMap::new,
             Collectors.counting()));
       return mapCount.entrySet().stream()
        .sorted(Map.Entry.<Character, Long>comparingByValue().reversed()
            .thenComparing(Map.Entry.comparingByKey())).findFirst().get().getKey();
    }
}