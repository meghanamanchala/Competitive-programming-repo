// 2. Top K Frequent Elements


// Given an integer array nums and an integer k, 
// return the k most frequent elements. 
// You may return the answer in any order.



package Week4.Day5;

class problem2 {

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
