class Solution {
    public boolean isSubsequence(String s, String t) {
        int size = 0;
        int j = 0;

        for(int i = 0;i < s.length();i++) {
            while(j < t.length() && t.charAt(j) != s.charAt(i)) {
                j++;
            }
            System.out.println(s.charAt(i));
            if(j == t.length()) return false;
            size += 1;
            j++;
        }

        if(size == s.length()) {
            return true;
        } else {
            return false;
        }

    }
}