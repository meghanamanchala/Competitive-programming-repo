//Problem - 9: Maximum Subarray

//Question

// Given an integer array nums, find the subarray
//  with the largest sum, and return its sum.


//Solution

class problem9 {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int total = 0;
        for(int n : nums){
            if (total < 0){
               total = 0;
            }
            total += n;
            res = Math.max(res,total);
        }
        return res;
        
    }
}