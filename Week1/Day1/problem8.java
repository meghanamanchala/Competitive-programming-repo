// Problem 8: Find the Duplicate Number

// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
// There is only one repeated number in nums, return this repeated number.
// You must solve the problem without modifying the array nums and uses only constant extra space.

//T.C : O(n) -> This algorithm iterates through array once i.e., until length of arrayy
//S.C : O(n) -> extra space is created for looping through each element i.e., cnt
//Solution

class problem8 {
    public int findDuplicate(int[] nums) {
        int len = nums.length;
        int[] cnt = new int[len+1];
        for(int i =0;i<len;i++){
           cnt[nums[i]]++;
           if(cnt[nums[i]]>1){
            return nums[i];
           }
        }
        return len;
    }
}