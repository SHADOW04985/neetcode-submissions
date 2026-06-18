class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List> map = new HashMap<>();

        for(String s : strs) {
            int arr[] = new int[26];
            for(char c : s.toCharArray()) {
                arr[c - 'a']++;
            }
            StringBuilder bld = new StringBuilder();
            for(int a : arr) {
                bld.append("#");
                bld.append(a);
            }
            String key = bld.toString();
            if(!map.containsKey(key)) {
                map.put(key,new ArrayList<String>());
            }
            map.get(key).add(s);
        }
        return new ArrayList(map.values());
    }
}
