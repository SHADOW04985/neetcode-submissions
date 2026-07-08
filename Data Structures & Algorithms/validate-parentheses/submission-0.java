class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        Map<Character,Character> close = new HashMap<>();
        close.put('}','{');
        close.put(')','(');
        close.put(']','[');

        for(char c : s.toCharArray()) {
            if(close.containsKey(c)) {
                if(!stk.isEmpty() && stk.peek() == close.get(c)) {
                    stk.pop();
                } else {
                    return false;
                }
            } else {
                stk.push(c);
            }
        }
        return stk.isEmpty();
    }
}
