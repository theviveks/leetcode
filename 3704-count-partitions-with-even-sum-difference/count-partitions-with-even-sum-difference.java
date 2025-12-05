class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        int count = 0;
        int leftSubArray = 0;
        int rightSubArray = 0;
        for (int i = 0; i < n - 1; i++) {
            leftSubArray += nums[i];
            rightSubArray = sum - leftSubArray;
            if ((leftSubArray - rightSubArray) % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}