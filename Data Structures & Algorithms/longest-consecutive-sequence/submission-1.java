class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        Arrays.sort(nums);
        int lng = 1;
        int cnt = 0;
        int vs = Integer.MIN_VALUE;
        for(int i = 0;i < nums.length;i++) {
            
            if(nums[i] - 1 == vs) {
                cnt++;
                vs = nums[i];
            }
            
            else if(nums[i] - 1 != vs && nums[i] != vs) {
                cnt = 1;
                vs = nums[i];
            }
            if(lng < cnt) {
                lng = cnt;
            }
        }




       return lng;
    }
}
