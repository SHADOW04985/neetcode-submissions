class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> ch = new HashSet<>();
        int len = 0;
        int l = 0;

        for(int r = 0;r < s.length();r++) {
            while(ch.contains(s.charAt(r))) {
                ch.remove(s.charAt(l));
                l++;
            }
            ch.add(s.charAt(r));
            len = Math.max(len,r - l + 1);
        }
        return len;
    }
}
