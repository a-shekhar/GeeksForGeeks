class Solution {
    public static void reverseStack(Stack<Integer> st) {
        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        reverseStack(st);
        insert(st, top);
    }

    private static void insert(Stack<Integer> st, int top){
        if(st.isEmpty()){
            st.add(top);
            return;
        }

        int popped = st.pop();
        insert(st, top);
        st.push(popped);
    }
}
