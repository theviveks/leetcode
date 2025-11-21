class Solution {
    
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if (n > m) {
            return false;
        }

        int[] hash1 = new int[26];
        int[] hash2 = new int[26];
        for (int i = 0; i < n; i++) {
            hash1[s1.charAt(i) - 'a']++;
            hash2[s2.charAt(i) - 'a']++;
        }
        for (int i = 0; i < m - n; i++) {
            if (Arrays.equals(hash1, hash2))
                return true;

            hash2[s2.charAt(i) - 'a']--;
            hash2[s2.charAt(i + n) - 'a']++;

        }
        if (Arrays.equals(hash1, hash2))
            return true;
            return false;
    }
}