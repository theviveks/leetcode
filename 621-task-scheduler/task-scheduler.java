class Solution {
    public int leastInterval(char[] tasks, int m) {
        int n = tasks.length;
        int maxi = 0;
        int[] hash = new int[26];
        for (int i = 0; i < n; i++) {
            hash[tasks[i] - 'A']++;
            maxi = Math.max(maxi, hash[tasks[i] - 'A']);
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (hash[i] == maxi) {
                count++;
            }
        }
        return Math.max(n, ((m + 1) * (maxi - 1)) + count);
    }
}