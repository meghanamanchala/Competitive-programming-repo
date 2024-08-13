//Problem - 4 : Find All Numbers Disappeared in an Array

//Question

// Given an array nums of n integers where nums[i] is in the range [1, n], 
// return an array of all the integers in the range [1, n] that do not appear in nums.

//Approach : Boolean

//T.C : O(n) -> This approch proccess each elemnt through array exactly once 
//S.C : O(n) -> the newly created ans array has same length as input array

//Solution

class problem4 {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        boolean[] isAvailable = new boolean[nums.length];
        for(int i =0;i<nums.length;i++){
            isAvailable[nums[i]-1] = true;
        }
        List<Integer> ans = new ArrayList<>();
        for(int i =0;i<isAvailable.length;i++){
            if(!isAvailable[i]){
                ans.add(i+1);
            }
        }
        return ans;
    }
}