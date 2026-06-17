class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length == 1) {
            return false;
        }

        Map<Integer,Integer> hsh = new HashMap<>();

        for(int i : nums) {
            
            if(hsh.containsKey(i)) {
                return true;
            } else {
                hsh.put(i,(hsh.getOrDefault(i,0) + 1));
            }
        }
        return false;

    }
}