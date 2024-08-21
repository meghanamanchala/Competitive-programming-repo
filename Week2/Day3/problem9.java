// Problem 9: Palindrome Linked List

// Given the head of a singly linked list, return true if it is a 
// palindrome
//  or false otherwise.

import java.lang.classfile.components.ClassPrinter.ListNode;
import java.util.Stack;

class problem9 {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack();
        ListNode curr = head;
        while(curr != null){
            stack.push(curr.val);
            curr = curr.next;
        }
        curr = head;
        while(curr != null && curr.val == stack.pop()){
            curr = curr.next;
        }
        return curr == null;
    }
}



