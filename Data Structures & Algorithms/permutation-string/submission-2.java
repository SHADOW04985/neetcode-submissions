class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        Map<Character,Integer> s1t = new HashMap<>();
        for(char c : s1.toCharArray()) {
            s1t.put(c,s1t.getOrDefault(c,0) + 1);
        }

        for(int i = 0;i < s2.length();i++) {
            Map<Character,Integer> s2t = new HashMap<>();
            int size = 0;
            
            for(int j = i;j < s2.length();j++) {
                char c = s2.charAt(j);
                s2t.put(s2.charAt(j),s2t.getOrDefault(s2.charAt(j),0) + 1);

                if(s1t.getOrDefault(c,0) < s2t.get(c)) {
                    break;
                }

                if(s1t.getOrDefault(c,0) == s2t.get(c)) {
                    size++;
                }

                if(size == s1t.size()) {
                    return true;
                }

            }
        }
        return false;
    }
}
