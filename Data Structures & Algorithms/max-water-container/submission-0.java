class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int big = Integer.MIN_VALUE;
        while (l < r) {
            int tank = Math.min(heights[l],heights[r]) * (r - l);
            if(tank > big) {
                big = tank;
            }
            if(heights[l] < heights[r]) {
                l++;
            }
            else {
                r--;
            }
        }
        return big;
    }
}
