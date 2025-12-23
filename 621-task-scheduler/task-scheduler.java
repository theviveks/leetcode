class Solution {
    public int leastInterval(char[] tasks, int m) {
        int n = tasks.length;
        int maxi = 0;
        int[] hash = new int[26];
        for (int i = 0; i < n; i++) {
            int curr = tasks[i] - 'A';
            hash[curr]++;
            maxi = Math.max(maxi, hash[curr]);
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