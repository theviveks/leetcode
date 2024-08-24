class Solution {
    public boolean binarySearch(int[] matrix, int m, int target) {
        int low = 0;
        int high = m - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (matrix[mid] == target) {
                return true;
            } else if (matrix[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            if (matrix[i][0] <= target && matrix[i][m - 1] >= target) {
                if (binarySearch(matrix[i], m, target)) {
                    return true;
                }
            }
        }
        return false;
    }
}