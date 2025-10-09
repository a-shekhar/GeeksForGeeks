class Solution {
    public int evaluatePostfix(String[] arr) {
Deque<Integer> stack = new ArrayDeque<>();
        int result = 0;
        int temp2;
        int temp1;
        for(String s : arr){
            switch (s) {
                case "+":
                    result = stack.pop() + stack.pop();
                    stack.push(result);
                    break;
                case "-":
                     temp2 = stack.pop();
                     temp1 = stack.pop();
                    result = temp1 - temp2;
                    stack.push(result);
                    break;
                case "*":
                    result = stack.pop() * stack.pop();
                    stack.push(result);
                    break;
                case "/":
                     temp2 = stack.pop();
                     temp1 = stack.pop();
                    result = Math.floorDiv(temp1, temp2);
                    stack.push(result);
                    break;
                case "^":
                    temp2 = stack.pop();
                    temp1 = stack.pop();
                    result = (int) Math.pow(temp1, temp2);
                    stack.push(result);
                    break;
                default:
                    stack.push(Integer.valueOf(s));
            }
        }
        return result;
        
    }
}