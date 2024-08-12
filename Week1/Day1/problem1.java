//Problem -1 : Two Sum 

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

//Apporach:
//Getting all possibles pairs using to for loops and checking it with target 
// if its true it will return indices of these two numbers
// else comes out of both for loops and returns empty array

// T.C : O(n*n) --> for using two for loops 
// S.C : O(n) -> Using extra space for creating new array

//Solution:

class problem1 {
    public int[] twoSum(int[] nums, int target) {

        for(int i =0;i<nums.length;i++){
             for(int j = i+1 ;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
             }
        }
       return new int[] {};
    }
}