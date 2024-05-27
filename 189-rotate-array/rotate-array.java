class Solution {
    public void rrotate(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public void rotate(int[] nums, int k) {
        k %= nums.length;
        int n = nums.length;
        rrotate(nums, 0, n - 1);
        rrotate(nums, 0, k - 1);
        rrotate(nums, k, n - 1);
    }

}