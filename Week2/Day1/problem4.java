// Problem 4: Power of two 

// Given an integer n, return true if it is a power of two. Otherwise, return false.
// An integer n is a power of two, if there exists an integer x such that n == 2x.


//T.C : O(n) 
//S.C : O(1) 

//Solution

public class problem4 {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        
        while (n > 0) {
            if (n == 1) return true;
            if (n % 2 != 0) break;
            n /= 2;
        }
        return false;
    }
}