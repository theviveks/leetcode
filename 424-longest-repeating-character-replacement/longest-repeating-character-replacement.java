class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int left = 0, right = 0;
        int maxFreq = 0, maxLen = 0;
        int[] hash = new int[26];
        while (right < n) {
            hash[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, hash[s.charAt(right) - 'A']);
            if ((right - left + 1) - maxFreq > k) {
                hash[s.charAt(left) - 'A']--;
                left++;
            }
            maxLen = Math.max(right - left + 1, maxLen);
            right++;
        }
        return maxLen;
    }
}