//Problem - 3 : Squares of a sorted array

//Question

// Given an integer array nums sorted in non-decreasing order, 
// return an array of the squares of each number sorted in non-decreasing order.

 
//Approach : Two Pointer

//T.C : O(n) -> This approch proccess each elemnt through array exactly once using two pointer
//S.C : O(n) -> the newly created ans array has same length as input array to store the sorted squares

//Solution

class problem3 {
    public int[] sortedSquares(int[] nums) {
    int low= 0;
    int n = nums.length;
    int high = n-1;
    int k = n-1;
    int[] ans = new int[n];
    while(low<=high){
        int left = nums[low]*nums[low];
        int right = nums[high]*nums[high];
        if(left > right){
            ans[k--]= left;
            low++;
        }else{
            ans[k--] = right;
            high--;
        }
    }
    return ans;
    }
}