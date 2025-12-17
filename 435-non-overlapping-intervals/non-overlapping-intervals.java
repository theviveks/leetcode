class Solution {
    public int eraseOverlapIntervals(int[][] nums) {
        int n = nums.length;
        Arrays.sort(nums, (a, b) -> a[1] - b[1]);
        int ans = 0;
        int k = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums[i][0] < k) {
                ans++;
            } else {
                k = nums[i][1];
            }
        }
        return ans;

    }
}