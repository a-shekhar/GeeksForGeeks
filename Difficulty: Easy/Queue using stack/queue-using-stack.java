class Queue {
    Stack<Integer> input = new Stack<Integer>();
    Stack<Integer> output = new Stack<Integer>();

    int dequeue() {
        while(!input.isEmpty()){
            output.push(input.pop());
        }
        return output.isEmpty() ? - 1: output.pop();
    }

    void enqueue(int x) {
        while(!output.isEmpty()){
            input.push(output.pop());
        }
        input.push(x);
    }
}
