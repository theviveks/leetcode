class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int ans = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > ans) {
                ans = nums[i];
                index = i;
            }
        }
        return index;
    }
}