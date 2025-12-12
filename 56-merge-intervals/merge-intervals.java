class Solution {
    public int[][] merge(int[][] nums) {
        int n = nums.length;
        if (n == 0 || nums == null) {
            return new int[0][0];
        }
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(nums, (a, b) -> Integer.compare(a[0], b[0]));
        ans.add(nums[0]);
        for (int i = 1; i < n; i++) {
            int[] last = ans.get(ans.size() - 1);
            int[] curr = nums[i];
            if (curr[0] <= last[1]) {
                last[1] = Math.max(last[1], curr[1]);
            } else {
                ans.add(nums[i]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}