//Problem - 2 : Search Insert Position

//Question

// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
// You must write an algorithm with O(log n) runtime complexity.

//Approach : Binary Search

//T.C : O(logn) -> WE eliminate half of the the array then let k is number of times we need to divide n ny 2 to reach 1 n/2^k = 1 ==> k = log n 
//S.C : O(1) -> since no extra space is utilised 

//Solution

class problem2 {
    public int searchInsert(int[] nums, int target) {
        int lp = 0;
        int rp = nums.length -1;
        while(lp<=rp){
            int mid = (lp+rp)/2;
            if(nums[mid] < target){
                lp = mid +1;
            }else if(nums[mid] > target){
                rp = mid -1;
            }else{
                return mid;
            }
        }
        return lp;
    }
}