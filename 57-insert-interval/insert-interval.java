class Solution {
    public int[][] insert(int[][] nums, int[] x) {
        int n = nums.length;
        List<int[]> ans = new ArrayList<>();
        int i = 0;
        while (i < n && nums[i][1] < x[0]) {
            ans.add(nums[i]);
            i++;
        }
        while (i < n && nums[i][0] <= x[1]) {
            x[0] = Math.min(nums[i][0], x[0]);
            x[1] = Math.max(nums[i][1], x[1]);
            i++;
        }
        ans.add(x);
        while (i < n && x[1] < nums[i][0]) {
            ans.add(nums[i]);
            i++;
        }
        return ans.toArray(new int[ans.size()][]);
    }
}