class Solution {

    public String encode(String s[]) {
        StringBuilder builder = new StringBuilder();
        for (String str: s){
            builder.append(str.length());
            builder.append("#");
            builder.append(str);
        }
        return builder.toString();
    }

    public String[] decode(String s) {
        if(s.trim().length() == 0){
            return new String[]{s};
        }
        int i = 0;
        int j;
        List<String> strList = new ArrayList<>();
        

        while (i < s.length()) {
            j = i;
            while(s.charAt(j) != '#'){ // when it is not equal to #
                j++;
            }

            int length = Integer.parseInt(s.substring(i, j)); // read actual length

            // read next string 
            String word = s.substring(j+1, j+1+length); // next word
            strList.add(word);

            i = j + 1 + length;
        }
        
        String[] arr = new String[strList.size()];
            int k = 0;
            
            for(String str : strList){
                arr[k] = str;
                k++;
            }

            return arr;
    }
}