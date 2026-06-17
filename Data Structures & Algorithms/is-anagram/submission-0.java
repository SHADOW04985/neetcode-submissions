class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        Map<Character,Integer> hsh = new HashMap<>();

        for(char i : s.toCharArray()) {
            hsh.put(i,(hsh.getOrDefault(i,0) + 1));
        }
        for(char i : t.toCharArray()) {
            hsh.put(i,(hsh.getOrDefault(i,0) - 1));
        }

        for(Map.Entry<Character,Integer> i : hsh.entrySet()) {
            if(i.getValue() != 0) {
                return false;
            }
        }

        return true;


    }
}
