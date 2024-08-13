//Problem - 10 : Longest Consecutive Sequence

//Question

// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
// You must write an algorithm that runs in O(n) time.

 
//Apporach: Hash Map

//T.C : O(n) ->  where n is the number of elements in the array.
//S.C : O(n) -> due to the space used by the HashSet to store the elements.

//Solution

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int best =0;
        for(int n:set){
            if(!set.contains(n-1)){
                int m = n+1;
                while(set.contains(m))
                {
                    m++;
                }
                best = Math.max(best,m-n);
            }
        }
        return best;
    }
}