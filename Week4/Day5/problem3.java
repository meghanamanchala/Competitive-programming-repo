// 93. Restore IP Addresses

// A valid IP address consists of exactly four integers separated by single dots.
// Each integer is between 0 and 255 (inclusive) and cannot have leading zeros.

// For example, "0.1.2.201" and "192.168.1.1" are valid IP addresses, 
// but "0.011.255.245", "192.168.1.312" and "192.168@1.1" are invalid IP addresses.
// Given a string s containing only digits, return all possible valid IP addresses
// that can be formed by inserting dots into s. You are not allowed to reorder or 
// remove any digits in s. You may return the valid IP addresses in any order.

// Example 1:

// Input: s = "25525511135"
// Output: ["255.255.11.135","255.255.111.35"]

package Week4.Day5;

class problem3 {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        List<String> arr = new ArrayList<>();
        dfs(s, arr, 0, res);
        return res;
    }

    private void dfs(String s, List<String> arr, int start, List<String> res) {
        if (start == s.length() && arr.size() == 4) {
            res.add(String.join(".", arr));
            return;
        }
        if (start == s.length() || arr.size() == 4) {
            return;
        }
        String num = "";
        for (int i = start; i < s.length() && Integer.parseInt(num + s.charAt(i)) <= 255; i++) {
            if (s.charAt(start) == '0' && i != start) break;
            num += s.charAt(i);
            arr.add(num);
            dfs(s, arr, i + 1, res);
            arr.remove(arr.size() - 1);
        }
    }
}
