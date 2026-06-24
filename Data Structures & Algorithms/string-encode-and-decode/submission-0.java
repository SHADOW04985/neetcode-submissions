class Solution {

    public static String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String s : strs) {
            sb.append(s.length()+"#"+s);
        }

        return sb.toString();
    }

    public static List<String> decode(String str) {

        List<String> st = new ArrayList<>();
        int i = 0;

        while(i < str.length()) {
            int j = i;
            while(str.charAt(j) != '#') {
                j++;
            }
            int l = Integer.parseInt(str.substring(i,j));
            i = j + 1;
            st.add(str.substring(i , i + l));
            i += l;
        }

        return st;

        
    }
}
