class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
         Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        stack.add(arr[n-1]);
        list.add(arr[n-1]);
        
        for(int i = n - 2; i >= 0; i--){
            if(arr[i] >= stack.peek()){
                list.add(arr[i]);
                stack.push(arr[i]);
            }
        }

        Collections.reverse(list);
        return list;
    }
}
