// Problem 8:  Remove Nth Node From End of List

// Question

// Given the head of a linked list, 
// remove the nth node from the end of the list and return its head.


import java.lang.classfile.components.ClassPrinter.ListNode;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


class problem8 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = new ListNode(0,head);
        ListNode dummy = res;
        for(int i =0;i<n;i++){
            head = head.next;
        }
        while(head != null){
            head = head.next;
            dummy = dummy.next;
        }
        dummy.next = dummy.next.next;
        return res.next;
    }
}