class Solution {
    public int characterReplacement(String s, int k) {
        Set<Character> hsh = new HashSet<>();
        int window = 0;
        
        for(char c : s.toCharArray()) {
            hsh.add(c);
        }

        for(char c : hsh) {
            int l = 0;
            int freq = 0;

            for(int r = 0;r < s.length();r++) {
                if(s.charAt(r) == c) {
                    freq++;
                }
                while((r - l + 1) - freq > k) {
                    if(s.charAt(l) == c) {
                        freq--;
                    }
                    l++;
                }
                window = Math.max(window,(r - l + 1));
            }
        }
        return window;
    }
}
