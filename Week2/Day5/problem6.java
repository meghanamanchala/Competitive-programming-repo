//Problem -6 : House robber II

// You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have a security system connected, and it will automatically contact the police if two adjacent houses were broken into on the same night.

// Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

//Solution:

class problem6 {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        return Math.max(houseRobberHelper(Arrays.copyOfRange(nums, 0, nums.length - 1)),
                houseRobberHelper(Arrays.copyOfRange(nums, 1, nums.length)));
    }

    private int houseRobberHelper(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;
        if (n == 1)
            return nums[0];

        int[] lookupArray = new int[n + 1];
        lookupArray[0] = 0;
        lookupArray[1] = nums[0];

        for (int i = 2; i <= n; i++) {
            lookupArray[i] = Math.max(nums[i - 1] + lookupArray[i - 2], lookupArray[i - 1]);
        }

        return lookupArray[n];
    }
}