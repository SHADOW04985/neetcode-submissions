class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        Queue<Integer> minHeap = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));
        for(int i : nums) {
            map.put(i,map.getOrDefault(i,0) + 1);
        }

        for(int i : map.keySet()) {
            minHeap.offer(i);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }
        int[] arr = minHeap.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
}
