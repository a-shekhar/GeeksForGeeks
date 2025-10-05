/*
Node class is as follows:

class Node {
    int data;
    Node next;

    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {

    // Return the sum of last k nodes
 public int sumOfLastN_Nodes(Node head, int n) {
       if(head == null){
            return 0;
        }
        if(n == 1){
            return head.data;
        }
        
        Node curr = head;
        Node prev = head;
        for(int i = 0; i < n; i++){
            curr = curr.next;
        }

        int sum = 0;

        while(curr != null){
           // sum += curr.data;
            prev = prev.next;
            curr = curr.next;
        }

        while(prev != null){
            sum += prev.data;
            prev = prev.next;
        }

        return sum;
    }
}