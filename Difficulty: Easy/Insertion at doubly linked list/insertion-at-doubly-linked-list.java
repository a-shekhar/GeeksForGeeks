/*
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node insertAtPos(Node head, int index, int data) {
       Node newNode = new Node(data);

        if(head == null){
            return newNode;
        }

        // if(head.next == null){
        //     head.next = newNode;
        //     return head;
        // }

        Node curr = head;
        
        for(int i = 0; i < index; i++){
            curr = curr.next;
        }

        newNode.next = curr.next;
            newNode.prev = curr;
            curr.next = newNode;
        return head;
    }
}