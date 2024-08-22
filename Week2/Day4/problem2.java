// Problem 2: Number Complement

// The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.
// Given an integer num, return its complement.
//Approach
//XOR Method (^)

//Solution

public class problem2 {
    public int findComplement(int num) {
        if(num == 0) return 1;
        int bitLength = Integer.toBinaryString(num).length();
        int mask = (1 << bitLength) - 1;
        return num ^ mask;
    }
}