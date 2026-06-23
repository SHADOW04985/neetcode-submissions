class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums) {
            map.put(i,map.getOrDefault(i,0) + 1);
        }

        List<Integer>[] bucket = new List[nums.length + 1];

        for(int i = 0;i < bucket.length;i++) {
            bucket[i] = new ArrayList<>();
        }

        for(int i : map.keySet()) {
            bucket[map.get(i)].add(i);
        }

        List<Integer> arr = new ArrayList<>();
        for (int i = bucket.length - 1; i >= 0; i--) {
            if (arr.size() == k) break;
            for (int num : bucket[i]) {          // loop through ALL elements in this bucket
                if (arr.size() == k) break;
                arr.add(num);
            }
        }
        return IntStream.range(0, arr.size()).map(i -> arr.get(arr.size() - 1 - i)).toArray();
    }
}

