//Problem -1 : Reverse Linked List

//Given the head of a singly linked list, reverse the list, and return the reversed list.

// T.C : O(n) 
// S.C : O(1)

//Solution:

class problem1 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}