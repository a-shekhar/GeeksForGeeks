// User function Template for Java
class StackQueue {
 Stack<Integer> input = new Stack();
    Stack<Integer> output = new Stack();
    
    public void push(int val) {
        input.push(val);    
    }

    public int pop() {
        shiftStacks();
        return output.isEmpty() ? -1 :output.pop();
    }

    // shift stacks only when needed
     void shiftStacks(){
        if(output.isEmpty()){
            while(!input.isEmpty()){
                output.push(input.pop());
            }
        }
    }
}