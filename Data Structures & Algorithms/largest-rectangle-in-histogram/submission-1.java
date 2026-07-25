class Solution {
    public int largestRectangleArea(int[] heights) {
        int size = 0;
        for(int i = 0;i < heights.length;i++) {
            int l = i;
            int r = i;
            while(l >= 0 && heights[l] >= heights[i]) {
                l--;
            }
            while(r < heights.length && heights[r] >= heights[i]) {
                r++;
            }
            l++;
            r--;
            size = Math.max((((r - l) + 1) * heights[i]),size); 

        }
        return size;
    }
}
