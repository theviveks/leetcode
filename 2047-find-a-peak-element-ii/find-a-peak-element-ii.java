class Solution {
    public int findMaxValue(int mat[][], int n, int col) {
        int index = -1;
        int maxElement = -1;
        for (int i = 0; i < n; i++) {
            if (mat[i][col] > maxElement) {
                maxElement = mat[i][col];
                index = i;
            }
        }
        return index;
    }

    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int low = 0;
        int high = m - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int maxIndex = findMaxValue(mat, n, mid);
            int maxValue = mat[maxIndex][mid];
            int left = mid - 1 >= 0 ? mat[maxIndex][mid - 1] : -1;
            int right = mid + 1 < m ? mat[maxIndex][mid + 1] : -1;
            if (maxValue > left && maxValue > right) {
                return new int[] { maxIndex, mid };
            } else if (maxValue > left) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }
}