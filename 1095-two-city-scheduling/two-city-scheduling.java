class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (a, b) -> (b[1] - b[0]) - (a[1] - a[0]));
        int ans = 0;
        int n = costs.length / 2;
        for (int i = 0; i < n; i++) {
            ans += costs[i][0];
            ans += costs[i + n][1];
        }
        return ans;
    }
}