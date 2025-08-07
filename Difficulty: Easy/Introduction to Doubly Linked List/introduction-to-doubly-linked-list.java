// User function Template for Java

class Solution {
    Node constructDLL(int arr[]) {
        // Code here
        Node head = null;
        Node tail = null;
        for(int num : arr){
            Node newNode = new Node(num);
            if(head == null){
                head = newNode;
                tail = newNode;
                continue;
            }

            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        
        return head;
        
    }
}