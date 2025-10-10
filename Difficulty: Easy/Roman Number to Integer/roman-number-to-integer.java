class Solution {
    public int romanToDecimal(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        
        int sum = 0;
        
        for(int i = 0; i < s.length() - 1; i++){
            if(romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i+1))){
                sum -= romanMap.get(s.charAt(i));
            } else {
                sum += romanMap.get(s.charAt(i));
            }
             
        }
        
        // add the last bit
        sum += romanMap.get(s.charAt(s.length()-1));
        return sum;
    }
}