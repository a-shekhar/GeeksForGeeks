/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        if(head == null || head.next == null){
            return true;
        }

        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node reversed = reverse(slow);
        slow = head;
        while(reversed != null){
            //System.out.println(reversed.data + " " + slow.data);
            if(slow.data != reversed.data){
                return false;
            }
            slow = slow.next;
            reversed = reversed.next;
        }

        return true;
    }

    Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node temp = null;

        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}