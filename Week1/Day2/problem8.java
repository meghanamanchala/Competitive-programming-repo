//Problem - 8: Top K Frequent Elements

//Question

// Given an integer array nums and an integer k, 
// return the k most frequent elements.
// You may return the answer in any order.

//Apporach: Hash Map

//T.C : O(n+mlogm+klogm)= O(logn) ->  where n is the iteration through numsand mlogm is the unqiue element chosen in nums since there are m  unique elements it works as m(logm) + k is poll and each poll operation takes O(logm) time so it is k (logm).
//S.C : O(n) -> Due to the space required for frequency map and the resultant array

//Solution

class problem8 {
    public int[] topKFrequent(int[] nums, int k) {
         Map<Integer ,Integer> map = new HashMap<>();
         for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
         }
         PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
         for(int key:map.keySet()){
            maxHeap.add(key);
         }
         int res[] = new int[k];
         for(int i =0;i<k;i++){
            res[i] = maxHeap.poll();
         }
         return res;
    }
}