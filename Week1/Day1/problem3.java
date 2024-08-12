//Problem -3 :

//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

//EDGE CASE:
//when k is more than length of array we can take module i.e., k = k%n 

//T.C: O(N+N) = O(N) --> 2 seperate for loops for extra rotated array to copy elements of nums using [(i+k)%n],other is for copying elements back to nums form rotated array

//S.C: O(N) --> additional array for rotated array has been used 


// Solution:

class problem3 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        int[] rotatedArray = new int[n];
        for(int i =0;i<n;i++){
            rotatedArray[(i+k)%n] = nums[i];
        }
        for(int i =0;i<n;i++){
            nums[i] = rotatedArray[i];
        }
    }
}