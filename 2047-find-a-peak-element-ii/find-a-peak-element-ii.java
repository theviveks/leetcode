class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        
        int maxElement = Integer.MIN_VALUE;
        int[] peakPosition = new int[2];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] > maxElement) {
                    maxElement = Math.max(maxElement, mat[i][j]);
                    peakPosition[0] = i;
                    peakPosition[1] = j;
                }
            }
        }
        
        return peakPosition;
    }
}
