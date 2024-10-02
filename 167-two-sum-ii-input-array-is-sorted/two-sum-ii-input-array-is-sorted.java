class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int i = 0;
        int j = n - 1;
        int sum = 0;
        while (numbers[i] + numbers[j] != target) {
            sum = numbers[i] + numbers[j];
            if (sum > target) {
                j--;
            } else {
                i++;
            }
        }
        return new int[] { i + 1, j + 1 };
    }
}