class Solution {
    public boolean isPalindrome(String s) {
        String st = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // st += s.replace(" ", "");
        System.out.println(st);
        return checkk(0,st);
    }

    public static boolean checkk(int i, String s) {
        if(i >= s.length()/2) return true;

        if(s.charAt(i) != s.charAt(s.length() - i - 1)) return false;

        return checkk(i + 1,s);
    }
}
