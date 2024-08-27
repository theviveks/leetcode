class Solution {
    public int partition(int[] nums, int low, int high) {
        int pivot = nums[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (nums[i] <= pivot && i <= high - 1) {
                i++;
            }
            while (nums[j] > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[low];
        nums[low] = nums[j];
        nums[j] = temp;
        return j;
    }

    public void quickSort(int[] nums,int low,int high){
        if(low<high){
            int pivotIndex=partition(nums,low,high);
            quickSort(nums,low,pivotIndex-1);
            quickSort(nums,pivotIndex+1,high);
        }
    }

    public void sortColors(int[] nums) {
        int n = nums.length;
        quickSort(nums, 0, n - 1);
    }
}