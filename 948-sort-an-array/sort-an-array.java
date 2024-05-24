import java.util.Random;

class Solution {
    static Random random = new Random();

    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            if (high - low + 1 <= 10) {
                insertionSort(arr, low, high); // Switch to insertion sort for small arrays
            } else {
                int pivotIndex = randomizedPartition(arr, low, high);
                quickSort(arr, low, pivotIndex - 1);
                quickSort(arr, pivotIndex + 1, high);
            }
        }
    }

    static int randomizedPartition(int arr[], int low, int high) {
        int randomIndex = random.nextInt(high - low + 1) + low;
        swap(arr, randomIndex, low); // Swap random pivot with the first element
        return partition(arr, low, high);
    }

    static int partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (i <= high && arr[i] <= pivot) i++;
            while (j >= low && arr[j] > pivot) j--;
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, low, j);
        return j;
    }

    static void insertionSort(int arr[], int low, int high) {
        for (int i = low + 1; i <= high; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= low && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }
}
