// 4. Find Minimum in Rotated Sorted Array II

// Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,4,4,5,6,7] might become:

// [4,5,6,7,0,1,4] if it was rotated 4 times.
// [0,1,4,4,5,6,7] if it was rotated 7 times.
// Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

// Given the sorted rotated array nums that may contain duplicates, return the minimum element of this array.


//Brute Force
class problem5 {
    public int findMin(int[] nums) {
        int min = nums[0];
        for(int i =0;i<nums.length;i++){
            min = Math.min(min,nums[i]);
        }
        return min;
    }
}

// You must decrease the overall operation steps as much as possible.

class problem5 {
    public int findMin(int[] nums) {
        int low =0, high = nums.length-1,min=Integer.MAX_VALUE;

        while(low<=high){

            int mid = low+ (high-low)/2;

            if(nums[low]== nums[mid] && nums[mid]==nums[high]){
                min = Math.min(min,nums[low]);
                low++;
                high--;
                continue;
            }

            if(nums[low]<nums[high]) {
                min = Math.min(min,nums[low]);
                break; 
            }

            else if(nums[low]<=nums[mid]){
                min = Math.min(min,nums[low]);
                low = mid+1;
            }
            else if(nums[mid]<=nums[high]){
                
                min = Math.min(min,nums[mid]);
                high = mid-1;
            }
        }
        return min;
    }
}