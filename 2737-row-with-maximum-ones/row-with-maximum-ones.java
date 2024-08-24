class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int index = 0;
        int countMax = 0;
        for (int i = 0; i < n; i++) {
            int countSum = 0;
            for (int j = 0; j < m; j++) {
                countSum += mat[i][j];
            }
            if (countSum > countMax) {
                countMax = countSum;
                index = i;

            }
        }
        return new int[] { index, countMax };
    }
}