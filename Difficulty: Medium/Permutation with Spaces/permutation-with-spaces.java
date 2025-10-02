// User function Template for Java

class Solution {

   ArrayList<String> permutation(String s) {
        ArrayList<String> result = new ArrayList<>();
        if(s.isBlank()){
            return result;
        }
        StringBuilder builder = new StringBuilder();
        builder.append(s.charAt(0));
        findPermutation(1, builder, s, result);
        return result;
    }

    private void findPermutation(int index, StringBuilder builder, String s, ArrayList<String> result){
        if(index == s.length()){
            result.add(builder.toString());
            return;
        }

        // insert a space before next char
        char ch = s.charAt(index);
        builder.append(" ");
        builder.append(ch);
        findPermutation(index + 1, builder, s, result);

        // delete last char
        builder.delete(builder.length() - 2, builder.length());

        // add char without space
        builder.append(ch);
        findPermutation(index + 1, builder, s, result);
        builder.deleteCharAt(builder.length()-1);
    }
}