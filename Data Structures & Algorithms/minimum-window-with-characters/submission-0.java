class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> thsh = new HashMap<>();
        Map<Character,Integer> shsh = new HashMap<>();

        for(char c : t.toCharArray()) {
            thsh.put(c,thsh.getOrDefault(c,0) + 1);
        }

        int size = 0;
        int len = Integer.MAX_VALUE;
        int l = 0;
        int arr[] = {-1,-1};
        for(int r = 0;r < s.length();r++) {
            char c = s.charAt(r);
            shsh.put(c,shsh.getOrDefault(c,0) + 1);
            if(thsh.containsKey(c) && thsh.get(c) == shsh.get(c)) {
                size++;
            }
            while(size == thsh.size()) {
                if((r - l + 1) < len) {
                    len = r - l + 1;
                    arr[0] = l;
                    arr[1] = r;
                }
                char left = s.charAt(l);
                System.out.println(left);
                shsh.put(left,shsh.get(left) - 1);

                if(thsh.containsKey(left) && shsh.get(left) < thsh.get(left)) {
                    size--;
                }
                l++;
            }
        }
        return len == Integer.MAX_VALUE ? "" : s.substring(arr[0],arr[1] + 1);

    }
}
