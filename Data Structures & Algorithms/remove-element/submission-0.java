class Solution {
    public int removeElement(int[] nums, int val) {
        int l = 0,r = 0;
        int count = 0;

        while(r < nums.length) {
            if(nums[r] != val) {
                System.out.printf("l = %d, r = %d%n",l,r);
                nums[l] = nums[r];
                r++;
                l++;
                
            } else {
                System.out.printf("l = %d, r = %d%n",l,r);
                count++;
                r++;
            }
        }
        return l;
    }
}