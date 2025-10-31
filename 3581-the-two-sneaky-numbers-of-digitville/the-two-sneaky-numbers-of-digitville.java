class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans = new int[2];
        int n = nums.length;
        Map<Integer, Integer> mapp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            mapp.put(nums[i], mapp.getOrDefault(nums[i], 0) + 1);
        }
        int index = 0;
        for (int key : mapp.keySet()) {
            if (mapp.get(key) == 2) {
                ans[index++] = key;
                if (index == 2) {
                    break;
                }
            }
        }
        return ans;
    }
}