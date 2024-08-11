class Solution {
    public int bs(int[] nums, int low, int high, int target) {
        int mid = (low + high) / 2;
        if (low > high) {
            return -1;
        }
        if (nums[mid] == target)
            return mid;
        else if (nums[mid] > target) {
            return bs(nums, low, mid - 1, target);
        } else {
            return bs(nums, mid + 1, high, target);
        }
    }

    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        return bs(nums, low, high, target);

    }
}