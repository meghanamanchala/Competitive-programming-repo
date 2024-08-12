// Problem 4: Remove duplicates from sorted array 

// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
// Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
// Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
// Return k.

//APPORACH:
//start with two pointer i, for iterating over array and j is for position tracking
//iterate and compare prev and curr elements if both are not equal increment j by 1
//return j+1 as we intializeed j with 0

//T.C : O(n) -> This algorithm iterates through array once i.e., until length of arrayy
//S.C : O(1) -> as constant j is returned so space complexicity is constant

//Solution

class problem4 {
    public int removeDuplicates(int[] arr) {
        int j =0;
        for(int i =1;i<arr.length;i++){
            if(arr[j] != arr[i]){
                j++;
                arr[j] = arr[i];
            }
        }
        return j+1;
        
    }
}