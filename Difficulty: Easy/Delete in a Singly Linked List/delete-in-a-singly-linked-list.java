/* Linklist node structure
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        if(head == null){
            return null;
        }

        if(x == 1){
            return head.next;
        }

        int i = 1;
        Node prev = new Node(-1);
        Node curr = head;

        while(curr != null && i < x){
            prev = curr;
            curr = curr.next;
            i++;
        }

        prev.next = curr != null ? curr.next : null;
        curr.next = null;
        
        return head;
    }
}