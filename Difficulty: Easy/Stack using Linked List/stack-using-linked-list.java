class MyStack {
    // class StackNode {
    //     int data;
    //     StackNode next;
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    // }
    StackNode head = null;
    StackNode top;
    int len = 0;

    void push(int a) {
        StackNode newNode = new StackNode(a);
        if(top == null){
            top = newNode;
            head = newNode;
        } else{
            top.next = newNode;
            top = newNode;
        } 
        len++;
    }

    // Function to remove an item from top of the stack.
    int pop() {
        if(top == null){
            return -1;
        } else if(head == top){
            int popped = top.data;
            len = 0;
            head = top = null;
            return popped;
        } else{
            StackNode temp  = head;
            while(temp.next != top){
                temp = temp.next;
            }
            int popped = top.data;
            temp.next = null;
            top = temp;
            len--;
            if(len == 0){
                head = null;
                top = null;
            }
            return popped;
        }
    }
}