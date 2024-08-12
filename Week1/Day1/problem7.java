// Problem 7: Best Time to Buy and sell stock

// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
// Note that you must do this in-place without making a copy of the array.

//APPORACH:
//Two pointer approach

//T.C : O(n) -> This algorithm iterates through array once i.e., until length of arrayy
//S.C : O(1) -> profit is only a constant value so constant amount of extra space has been utilised

//Solution

class problem7 {
    public void moveZeroes(int[] nums) {
        int lp =0;
        for(int rp =0;rp<nums.length;rp++){
            if(nums[rp] != 0){
                int temp = nums[rp];
                nums[rp] = nums[lp];
                nums[lp] = temp;
                lp++;
            }
        }
        
    }
}