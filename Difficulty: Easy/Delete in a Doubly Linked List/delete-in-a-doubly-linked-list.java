/*
Structure of a Doubly LinkList
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node delPos(Node head, int x) {
        if(x == 1){
            Node temp = head.next;
            head.next = null;
            temp.prev = null;
            head = temp;
            return head;
        }
        
        Node curr = head;
        Node prev = head;
        
        for(int i = 1; i < x; i++){
            prev = curr;
            curr = curr.next;
        }
        
        prev.next = curr.next;
        if (curr.next != null)
        curr.next.prev = prev;
        curr.next = null;
        curr.prev = null;
        return head;
    }
}