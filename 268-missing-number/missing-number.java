class Solution {
    public int missingNumber(int[] nums) {
        int xor1 = 0, xor2 = 1;
        int N = nums.length;
        for (int i = 0; i < N; i++) {
            xor2 = xor2 ^ nums[i];
            xor1 = xor1 ^ (i + 2);
        }
        xor1 = xor1 ^ (N + 1);

        return (xor1 ^ xor2);
    }
}
