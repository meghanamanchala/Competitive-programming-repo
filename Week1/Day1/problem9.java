// Problem 9: Find the Duplicate Number

// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
// There is only one repeated number in nums, return this repeated number.
// You must solve the problem without modifying the array nums and uses only constant extra space.


//APPORACH
//XOR --> It cancels all values which appears twice

//T.C : O(n) -> This algorithm iterates through array once i.e., until length of arrayy
//S.C : O(n) -> extra space is created for looping through each element i.e., cnt
//Solution

class problem9 {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; 
        }
        return result; 
    }
}



