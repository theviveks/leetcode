class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> mapp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            mapp.put(nums[i], mapp.getOrDefault(nums[i], 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            if (mapp.get(nums[i]) == 1) {
                return nums[i];
            }
        }
        return -1;
    }
}
