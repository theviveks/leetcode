class Solution {
    public int finalValueAfterOperations(String[] s) {
        int X = 0;
        for (String string : s) {
            if (string.contains("++")) {
                X++;
            } else {
                X--;
            }
        }
        return X;
    }
}