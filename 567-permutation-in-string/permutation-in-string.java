class Solution {
    private boolean hashMatches(int[] hash1, int[] hash2) {
        for (int i = 0; i < 26; i++) {
            if (hash1[i] != hash2[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if (n > m) {
            return false;
        }

        int[] hash1 = new int[26];
        int[] hash2 = new int[26];
        for (int i = 0; i < n; i++) {
            hash1[s1.charAt(i) - 97]++;
            hash2[s2.charAt(i) - 97]++;
        }
        for (int i = 0; i < m - n; i++) {
            if (hashMatches(hash1, hash2)) {
                return true;
            }
            hash2[s2.charAt(i) - 97]--;
            hash2[s2.charAt(i + n) - 97]++;

        }
        return hashMatches(hash1, hash2);
    }
}