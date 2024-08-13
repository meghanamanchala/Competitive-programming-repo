//Problem - 5: Majority Element

//Question

// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

//T.C : O(n) -> This approch proccess each elemnt through array exactly once 
//S.C : O(1) -> As no constant value of space is utilisied here the space complexity is O(1)

//Solution

class problem5 {
    public int majorityElement(int[] nums) {
        int res = 0;
        int majority = 0;
        for(int n : nums){
            if(majority == 0){
                res = n;
            }
            majority += n == res ? 1: -1;
        }
        return res;
    }
}
