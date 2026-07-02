class Solution {
    public int lengthOfLongestSubstring(String s) {
        // This is bruteForce
        int len = 0;

        for(int i = 0;i < s.length();i++) {
            Set<Character> ch = new HashSet<>();
            for(int j = i;j < s.length();j++) {
                if(ch.contains(s.charAt(j))) {
                    break;
                }
                ch.add(s.charAt(j));
            }
            len = Math.max(len,ch.size());
        }
        return len;
    }
}
