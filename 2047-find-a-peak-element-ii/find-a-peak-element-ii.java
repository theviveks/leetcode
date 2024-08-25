class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int maxElement = Integer.MIN_VALUE;
        int[] peakPosition = new int[2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] > maxElement) {
                    maxElement = mat[i][j];
                    peakPosition[0] = i;
                    peakPosition[1] = j;
                }
            }
        }
        return peakPosition;
    }
}