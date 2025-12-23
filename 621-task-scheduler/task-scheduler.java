class Solution {
    public int leastInterval(char[] tasks, int m) {
        int n = tasks.length;
        int[] hash = new int[26];
        for (int i = 0; i < n; i++) {
            hash[tasks[i] - 'A']++;
        }
        System.out.println(Arrays.toString(hash));
        int maxi = 0;
        for (int i = 0; i < hash.length; i++) {
            maxi = Math.max(maxi, hash[i]);
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