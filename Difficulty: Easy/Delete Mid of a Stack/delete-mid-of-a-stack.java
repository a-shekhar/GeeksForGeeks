class Solution {
    // Function to delete middle element of a stack.
    public static void deleteMid(Stack<Integer> s) {

        int n = s.size();
        int midFromBottom = (n + 1) / 2;
        int targetFromTop = n - midFromBottom + 1; // 1-based from top

        helper(s, 1, targetFromTop);
        //System.out.println(i + " " + (int) Math.ceil(st.size() / 2.0));

    }

    private static void helper(Stack<Integer> st, int i, int mid) {
        if(i == mid){
            //System.out.println("Aditya");
            st.pop();
            return;
        }
        int top = st.pop();
        helper(st, i + 1, mid);
        st.push(top);
    }
}