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
        Set<Integer> set = new HashSet<>();
        set.add(curr.data);
        
        while(curr.next != null){
            if(set.contains(curr.next.data)){
                curr.next = curr.next.next;
            }else{
                set.add(curr.next.data);
                curr = curr.next;
            }
        }
        
        return head;
        
    }
}