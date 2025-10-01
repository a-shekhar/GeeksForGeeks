class Solution {
    // Function to delete middle element of a stack.
    public static void deleteMid(Stack<Integer> s) {

        int n = s.size();
        int midFromBottom = (n + 1) / 2;
        int targetFromTop = n - midFromBottom + 1; // 1-based from top

        helper(s, targetFromTop);
    }

    private static void helper(Stack<Integer> st, int mid) {
        if(mid == 1){
            st.pop();
            return;
        }
        int top = st.pop();
        helper(st, mid - 1);
        st.push(top);
    }
}