//Problem - 7: Sort colors

//Question

// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
// You must solve this problem without using the library's sort function.

//Apporach: Hash Map

//T.C : O(n) ->  where n is the number of elements in the array.
//S.C : O(1) -> due to the constant space used for the HashMap and other variables.

//Solution

import java.util.HashMap;

class problem7 {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        count.put(0,0);
        count.put(1,0);
        count.put(2,0);
        for(int num: nums){
            count.put(num,count.get(num)+1);
        }
        int index = 0;
        for(int color = 0;color<3;color++){
            int freq = count.get(color);
            for(int j =0;j<freq;j++){
                nums[index] = color;
                index++;
            }
        }
    }
}