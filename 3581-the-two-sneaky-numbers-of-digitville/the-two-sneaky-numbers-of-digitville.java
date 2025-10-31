class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2];
        Set<Integer> st = new HashSet<>();
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (st.contains(nums[i])) {
                ans[index++] = nums[i];
            } else {
                st.add(nums[i]);
            }
        }
        return ans;
    }
}