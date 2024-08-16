class Solution {
    public boolean rotateString(String s, String goal) {
        if (goal.length() != s.length()) {
            return false;
        }
        String c=s+s;
        return c.contains(goal);
    }
}
