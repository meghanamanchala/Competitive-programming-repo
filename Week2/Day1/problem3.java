//Problem -3 : factorial

// Given an integer n, return the number of factorial

// Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.


//T.C: O(n)
//S.C: O(n)


// Solution:

class problem3 {
    public int factorial(int n) {
        if(n<=1) return 1;
        return factorial(n-1) * n;
    }
}