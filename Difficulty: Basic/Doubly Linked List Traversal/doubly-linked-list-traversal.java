// User function Template for Java

/*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public static ArrayList<Integer> displayList(Node head) {
        // your code here
        ArrayList<Integer> result = new ArrayList<>();
        Node curr = head;
        while(curr != null){
            result.add(curr.data);
            curr = curr.next;
        }
        
        return result;
    }
}