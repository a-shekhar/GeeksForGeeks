import java.util.function.Function;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

class Solution {
    public char nonRepeatingChar(String s) {
         // code here
        Map<Character, Long> charCount =
         s.chars().mapToObj(c -> (char) c)
         .collect(Collectors.groupingBy
            (Function.identity(), LinkedHashMap::new, Collectors.counting()));

       return charCount.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().map(x -> x.getKey()).orElse('$');
        
    }
}
