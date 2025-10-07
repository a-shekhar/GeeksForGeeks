class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        int[] wordsCounter;
        StringBuilder builder;
        Map<String, ArrayList> map = new HashMap<>();

        for(String word : arr){
            wordsCounter = new int[26];
            builder = new StringBuilder();
            for(int i = 0;  i < word.length(); i++){
                wordsCounter[word.charAt(i) - 'a']++;
            }

            for(int i : wordsCounter){
                //if(i != 0){
                    builder.append(i).append('*');
                //}
            }

            if(!map.containsKey(builder.toString())){
                ArrayList<String> words = new ArrayList<>();
                words.add(word);
                map.put(builder.toString(), words);
            } else {
                map.get(builder.toString()).add(word);
                
            }

        }
        //System.out.println(map);
        for(ArrayList<String> value : map.values()){
            result.add(value);
        }
        return result;
        
    }
}
