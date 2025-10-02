// User function Template for Java

class Solution {
    public List<String> AllPossibleStrings(String s) {
        List<String> result = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        findSubsequences(0, s, builder, result);
        Collections.sort(result);
        return result;
    }

    private void findSubsequences(int curr, String s, StringBuilder builder, List<String> result) {
        if(curr == s.length()){
            result.add(builder.toString());
            return;
        }

        // include the current element 
        builder.append(s.charAt(curr));

        // recurse to the next element 
        findSubsequences(curr + 1, s, builder, result);

        // Backtrack: Remove the current element and explore
        // the next possibility
        builder.deleteCharAt(builder.length() - 1);

        // exclude the current element
        findSubsequences(curr + 1, s, builder, result);

    }

}