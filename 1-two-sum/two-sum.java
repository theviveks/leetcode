class Solution {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        Map<Integer, Integer> mapp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int sum = target - nums[i];
            if (mapp.containsKey(sum)) {
                return new int[] { mapp.get(sum), i };
            }
            mapp.put(nums[i], i);
        }
        return new int[] { -1, -1 };
    }
}