//Problem - 8: Happy Number

//Question

// Write an algorithm to determine if a number n is happy.

// A happy number is a number defined by the following process:

// Starting with any positive integer, replace the number by the sum of the squares of its digits.
// Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
// Those numbers for which this process ends in 1 are happy.
// Return true if n is a happy number, and false if not.

//Solution

import java.util.LinkedList;


class problem8 {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = square(slow);
            fast = square(square(fast));
        }while(slow != fast);
        return slow == 1;
    }
    public int square(int num){
        int ans = 0;
        while(num > 0){
            int remainder = num%10;
            ans += remainder * remainder;
            num /= 10;
        }
        return ans;
    }
}