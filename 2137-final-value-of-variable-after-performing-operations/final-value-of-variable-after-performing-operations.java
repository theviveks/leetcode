class Solution {
    public int finalValueAfterOperations(String[] s) {
        int X = 0;
        int n = s.length;
        for (int i = 0; i < n; i++) {
            String ch = s[i];
            if (ch.equals("--X")) {
                --X;
            } else if (ch.equals("++X")) {
                ++X;
            } else if (ch.equals("X--")) {
                X--;
            } else if (ch.equals("X++")) {
                X++;
            }
        }
        return X;
    }
}