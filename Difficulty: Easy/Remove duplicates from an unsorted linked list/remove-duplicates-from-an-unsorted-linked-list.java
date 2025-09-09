/* The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    // Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) {
        if(head == null || head.next == null){
            return head;
        }
        
        Node curr = head;
        Node temp;
        
        while(curr != null){
            temp = curr;
            while(temp != null && temp.next != null){
                if(temp.next.data == curr.data){
                    temp.next = temp.next.next;
                }else{
                    temp = temp.next;
                }
            }
            curr = curr.next;
        }
        
        return head;
        
    }
}