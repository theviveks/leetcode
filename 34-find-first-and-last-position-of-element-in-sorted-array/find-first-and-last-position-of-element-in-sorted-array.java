class Solution {
    public int firstOccurrence(int[] nums, int n, int x) {
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

    public int lastOccurrence(int[] nums, int n, int x) {
        int low = 0;
        int high = n - 1;
        int last = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == x) {
                last = mid;
                low = mid + 1;
            } else if (nums[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return last;
    }

    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int first = firstOccurrence(nums, n, target);
        int last = lastOccurrence(nums, n, target);
        return new int[] { first, last };
    }
}
