//Problem -1 : Maximum product subarray 

// Given an integer array nums, find a subarray that has the largest product, and return the product.

// The test cases are generated so that the answer will fit in a 32-bit integer.
//Solution:

class problem1 {
    public int maxProduct(int[] nums) {
        int max = nums[0],min = nums[0],ans = nums[0];
        for(int i =1;i<nums.length;i++){
            if(nums[i]<0){
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(nums[i],max*nums[i]);
            min = Math.min(nums[i],min*nums[i]);

            ans = Math.max(ans,max);
        }
        return ans;
    }
}