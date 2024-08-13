class Solution {
    public int firstOccurance(int[] nums, int n, int x) {
        int low = 0;
        int high = n - 1;
        int first = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == x) {
                first = mid;
                high = mid - 1;
            } else if (nums[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return first;
    }

    public int secondOccurance(int[] nums, int n, int x) {
        int low = 0;
        int high = n - 1;
        int second = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == x) {
                second = mid;
                low = mid + 1;
            } else if (nums[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return second;
    }

    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int first = firstOccurance(nums, n, target);
        if (first == -1) {
            return new int[] { -1, -1 };
        }
        int second = secondOccurance(nums, n, target);
        return new int[] { first, second };
    }
}