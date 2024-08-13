//Problem - 9: Kth Largest Element in an Array

//Question

// Given an integer array nums and an integer k, return the kth largest element in the array.
// Note that it is the kth largest element in the sorted order, not the kth distinct element.

//T.C : O(nlogn) ->  due to sorting operation
//S.C : O(logn) -> due to the extra space required for sorting

//Solution

class problem9 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}