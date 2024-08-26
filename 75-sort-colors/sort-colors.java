class Solution {
    public void merge(int[] nums, int low, int mid, int high) {
        ArrayList<Integer> ans = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (nums[left] < nums[right]) {
                ans.add(nums[left]);
                left++;
            } else {
                ans.add(nums[right]);
                right++;
            }
        }
        while (left <= mid) {
            ans.add(nums[left]);
            left++;
        }
        while (right <= high) {
            ans.add(nums[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            nums[i] = ans.get(i - low);
        }
    }

    public void mergeSort(int[] nums, int low, int high) {
        if (low == high)
            return;
        int mid = (low + high) / 2;
        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);
        merge(nums, low, mid, high);
    }

    public void sortColors(int[] nums) {
        int n = nums.length;
        mergeSort(nums, 0, n - 1);
    }
}