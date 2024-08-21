// Problem 5: Remove Linked list elements

// Given the head of a linked list and an integer val,
// remove all the nodes of the linked list that has Node.val == val, and return the new head.

/
//Solution

import java.lang.classfile.components.ClassPrinter.ListNode;

class problem5{
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        head.next = removeElements(head.next,val);
        return head.val == val ? head.next: head;
    }
}