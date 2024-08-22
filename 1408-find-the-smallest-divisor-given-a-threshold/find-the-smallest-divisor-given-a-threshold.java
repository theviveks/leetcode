class Solution {
    public int sumOfDivisor(int[] nums, int n, int x) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.ceil((double) nums[i] / x);
        }
        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        if (n > threshold)
            return -1;
        // int maxi = Integer.MIN_VALUE;
        // for (int i = 0; i < n; i++) { //N
        // maxi = Math.max(maxi, nums[i]);
        // }
        int low = 1;
        int high = 1000000;
        int ans = -1;
        while (low <= high) { // log maxi
            int mid = (low + high) / 2;
            if (sumOfDivisor(nums, n, mid) <= threshold) { // n
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}