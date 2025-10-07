class Solution {

    public String encode(String s[]) {
        StringBuilder builder = new StringBuilder();
        for(String str : s){
            builder.append(str.length()).append("#").append(str);
        }
        return builder.toString();
    }

    public String[] decode(String s) {
        ArrayList<String> list = new ArrayList<>();
        int i = 0; 
        int j = 0;
        while(i < s.length()){
            j = i;
            while(s.charAt(j) != '#'){
                j++;
            }

            int len = Integer.parseInt(s.substring(i, j));
            String word = s.substring(j+1, j+1+len);
            list.add(word);
            // move to next segment
            i = j + 1 + len;
        }

        return list.toArray(new String[0]);
    }
}