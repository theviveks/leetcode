class Solution {
    public int findMaxIndex(int[][] mat, int n, int col) {
        int index = -1;
        int maxIndex = -1;
        for (int i = 0; i < n; i++) {
            if (mat[i][col] > maxIndex) {
                maxIndex = mat[i][col];
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
            int maxIndexValue = findMaxIndex(mat, n, mid);

            int midValue = mat[maxIndexValue][mid];
            int left = mid - 1 >= 0 ? mat[maxIndexValue][mid - 1] : -1;
            int right = mid + 1 < m ? mat[maxIndexValue][mid + 1] : -1;

            if (midValue > left && midValue > right) {
                return new int[] { maxIndexValue, mid };
            } else if (midValue < left) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return new int[] { -1, -1 };
    }
}
