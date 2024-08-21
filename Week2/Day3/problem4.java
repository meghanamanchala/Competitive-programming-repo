// Problem 4: deleteDuplicates

// Given the head of a sorted linked list, delete all 
// duplicates such that each element appears only once. Return the linked list sorted as well.

//T.C : O(n) 
//S.C : O(n) 

//Solution

import java.lang.classfile.components.ClassPrinter.ListNode;

public class problem4 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode res = head;
        while(head!= null && head.next!= null){
            if(head.val == head.next.val){
                head.next  = head.next.next;
            }else{
                head = head.next;
            }
        }
        return res;
    }
}