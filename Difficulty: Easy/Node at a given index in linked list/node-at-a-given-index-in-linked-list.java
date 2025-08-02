/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public int GetNth(Node head, int index) {
        // Code here
        Node curr = head;
        int i = 1;
        while(curr != null && i < index){
            curr = curr.next;
            i++;
        }
        
        return curr != null ? curr.data :  -1;
    }
}