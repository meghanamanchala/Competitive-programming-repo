// 915. Partition Array into Disjoint Intervals

// Given an integer array nums, partition it into two (contiguous) subarrays left and right so that:

// Every element in left is less than or equal to every element in right.
// left and right are non-empty.
// left has the smallest possible size.
// Return the length of left after such a partitioning.

// Test cases are generated such that partitioning exists.

//Solution:


class problem1 {
    public int partitionDisjoint(int[] nums) {
        
        int partition = 0;
        int leftMax = nums[0];
        int rightMax = nums[1];
        for(int x = 2;x< nums.length;x++){
            while(!(leftMax <= rightMax)){ //move forward until we find a larger value than leftMax
                   partition++;
                   rightMax = nums[x];
                   x++;
            }

            if(x<nums.length && nums[x] < leftMax){ //expand left arr till this point
                leftMax = rightMax;
                rightMax = -1;
                partition = x-1;
            }
            else if(x < nums.length && nums[x] > rightMax){ //update rightMax
                rightMax = nums[x];
            }
        }


        return ++partition; //we are tracking last index of left arr so we have to increment for correct size return

    }
}