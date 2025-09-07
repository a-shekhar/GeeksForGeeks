/*
class Node {
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
};
*/

class Solution {
    public int cycleStart(Node head) {
        if(head == null || head.next == null){
            return -1;
        }

        Node slow = head;
        Node fast = head;
        boolean res = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                res = true;
                break;
            }
        }
        
       
        if(res){
            slow = head;
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
            }
        }
        
        return !res ? -1 : slow.data;
        
    }
}