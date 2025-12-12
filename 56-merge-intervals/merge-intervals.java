class Solution {
    public int[][] merge(int[][] nums) {
        int n = nums.length;
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(nums, (a, b) -> Integer.compare(a[0], b[0]));
        ans.add(nums[0]);
        for (int i = 1; i < n; i++) {
            int[] last = ans.get(ans.size() - 1);
            if (nums[i][0] <= last[1]) {
                last[1] = Math.max(last[1], nums[i][1]);
            } else {
                ans.add(nums[i]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}