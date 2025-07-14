class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
         Stack<Integer> helperStack = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = arr.length-1; i >=0; i--){
            if(helperStack.isEmpty()){
                result.add(0, -1);
                helperStack.push(arr[i]);
                continue;
            }

            if(helperStack.peek() > arr[i]){
                result.add(0, helperStack.peek());
                helperStack.push(arr[i]);
            }else{
                while(!helperStack.isEmpty() && helperStack.peek() <= arr[i]){
                    helperStack.pop();
                }

                if(helperStack.isEmpty()){
                    result.add(0, -1);
                }else{
                    result.add(0, helperStack.peek());
                }
                helperStack.push(arr[i]);
            }


        }
        
        return result;
    }
}