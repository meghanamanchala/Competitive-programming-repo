// Problem 2: Fibbanoci series

// The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
// F(0) = 0, F(1) = 1
// F(n) = F(n - 1) + F(n - 2), for n > 1.
// Given n, calculate F(n).

//T.C : O(2**n)
//S.C : O(1) 

//Solution

class problem2 {
    public int fib(int n) {
        if(n<=1) return n;
        return fib(n-1) + fib(n-2);
    }
}