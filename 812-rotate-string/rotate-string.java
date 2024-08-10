class Solution {
    public boolean rotateString(String s, String goal) {
        if (goal.length() != s.length()) {
            return false;
        }
        String rotated = s + s;
        int j = 0;
        int count = 0;
        for (int i = 0; i < rotated.length(); i++) {
            if (rotated.charAt(i) == goal.charAt(j)) {
                count++;
                j++;
                if (count == goal.length()) {
                    return true;
                }
            } else {
                i -= count;
                count = 0;
                j = 0;
            }
        }
        return false;
    }
}
