class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        Deque<Integer> stack = new ArrayDeque<>();
        int n = arr.length;
        int[] result = new int[n];

        result[n-1] = -1;
        stack.push(arr[n-1]);

        for(int i = n - 2;  i >=0; i--){
            while(!stack.isEmpty() && stack.peek() >= arr[i]){
                stack.pop();
            }

            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);

        }
        
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int x : result) list.add(x);
        return list;
    }
}