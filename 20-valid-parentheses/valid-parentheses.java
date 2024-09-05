class Solution {
    public boolean isValid(String s) {
        Stack<Character> ans = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char a = s.charAt(i);
            if (a == '{' || a == '[' || a == '(') {
                ans.push(a);
            } else if (ans.isEmpty()) {
                return false;
            } else if (a == '}' && ans.pop() != '{') {
                return false;
            } else if (a == ']' && ans.pop() != '[') {
                return false;
            } else if (a == ')' && ans.pop() != '(') {
                return false;
            }
        }
        return ans.isEmpty();
    }
}