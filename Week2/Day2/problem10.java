//Problem - 10 : Contains Duplicate

//Question

// Given an integer array nums, return true 
// if any value appears at least twice in the array, and return false if every element is distinct.
 
//Solution

class problem10 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1])
                return true;
        }
        return false;
    }
}