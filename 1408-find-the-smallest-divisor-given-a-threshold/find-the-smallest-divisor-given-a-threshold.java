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
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, nums[i]);
        }
        int low = 1;
        int high = maxi;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (sumOfDivisor(nums, n, mid) <= threshold) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}