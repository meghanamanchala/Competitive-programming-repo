//Problem - 1 : Valid Anagram

//Question

// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

//Approach : HashMap

//T.C : O(n+n)=O(2n)=O(n) -> This algorithm iterates through array once i.e., until length of arrayy for both strings
//S.C : O(n) -> Extra space is used for creating count which iterates through unique elements

//Solution

class problem1 {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> count = new HashMap<>();
        for(char x: s.toCharArray()){
            count.put(x,count.getOrDefault(x,0)+1);
        }
        for(char x: t.toCharArray()){
            count.put(x,count.getOrDefault(x,0)-1);
        }
        for(int val : count.values()){
            if(val != 0){
                return false;
            }
        }
        return true;
        
    }
}