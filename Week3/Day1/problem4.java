// 4. Find the Duplicate Number  

// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

// There is only one repeated number in nums, return this repeated number.

// You must solve the problem without modifying the array nums and uses only constant extra space.


//Brute Force
class problem4 {
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

// the problem without modifying the array nums and uses only constant extra space.

class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        do { // we are sure that at least one duplicate is there
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);
        // find the head of loop
        fast = nums[0];
        while(slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;
    }
}