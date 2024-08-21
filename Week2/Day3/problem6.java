//Problem -6 : Intersection of Two Linked Lists

// Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.
// For example, the following two linked lists begin to intersect at node c1:
// The test cases are generated such that there are no cycles anywhere in the entire linked structure.
// Note that the linked lists must retain their original structure after the function returns.

//Solution:

import java.lang.classfile.components.ClassPrinter.ListNode;

class problem6 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode a = headA;
        ListNode b = headB;

        while(a!= b){
            a = a==null ? headB : a.next;
            b = b==null ? headA : b.next;
        }
        return a;
    }
}