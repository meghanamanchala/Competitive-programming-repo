//Problem - 10 : Maximum Length of Repeated Subarray

//Question

// Given two integer arrays nums1 and nums2, 
// return the maximum length of a subarray that appears in both arrays.
 
// time complexity : O(M*N)
// space complexity : O(M*N)

//Solution

class problem10 {
    public static int findLength(int[] arr1, int[] arr2) {
         int m = arr1.length;
         int n = arr2.length;
         int[][] dp = new int[m + 1][n + 1];
         int max = 0;
         for (int i = 1; i <= m; i++) {
             for (int j = 1; j <= n; j++) {
                 if (arr1[i - 1] == arr2[j - 1]) {
                     dp[i][j] = dp[i - 1][j - 1] + 1;
                     max = Math.max(max, dp[i][j]);
                 }
             }
         }
         return max;
     }
 }