// 2. Combination Sum III

// Find all valid combinations of k numbers that sum up to n such that
// the following conditions are true:

// Only numbers 1 through 9 are used.
// Each number is used at most once.
// Return a list of all possible valid combinations. The list must not contain the same combination twice, and the combinations may be returned in any order.

// Example 1:

// Input: k = 3, n = 7
// Output: [[1,2,4]]
// Explanation:
// 1 + 2 + 4 = 7
// There are no other valid combinations.



package Week4.Day5;

class problem2 {

    private void findCombinationsSum(int index, int k, int target, List<List<Integer>> result, List<Integer> current) {
        if(target == 0 && current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }

        if(current.size() > k)
            return;

        for(int i = index; i <= 9; i++) {
            if(i > target) break;
            current.add(i);
            findCombinationsSum(i+1, k, target - i, result, current);
            current.remove(current.size() -1);
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        findCombinationsSum(1, k, n, result, new ArrayList<>());
        return result;
    }
}
