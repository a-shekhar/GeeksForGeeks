/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int d) {
        data = d;
        next = null;
        prev = null;
    }
}
*/

class Solution {
    public Node createDLL(int arr[]) {
        Node newNode = new Node(arr[0]);
        Node head = newNode;
        Node tail = newNode;
        for(int i = 1; i < arr.length; i++){
            newNode = new Node(arr[i]);
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        
        return head;
    }
}