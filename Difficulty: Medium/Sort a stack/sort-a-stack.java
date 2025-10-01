class Solution {
    public static void sortStack(Stack<Integer> st) {
        //return st;        
        //sort()
        if(st.isEmpty()){
            return;
        }
        int popped = st.pop();
        sortStack(st);
        insert(st, popped);
    }
    
    public static void insert(Stack<Integer> st, int top) {
        if(st.isEmpty() || st.peek() <= top){
            st.push(top);
            return;
        }
        int popped = st.pop();
        //st.push(top);
        //top = popped;
        insert(st, top);
        st.push(popped);
    }
}