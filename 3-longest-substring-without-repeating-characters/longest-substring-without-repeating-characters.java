class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash = new int[128]; // stores last seen index + 1 for ASCII
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            // Move left to the next position after previous occurrence (if any)
            left = Math.max(left, hash[c]);
            maxLen = Math.max(maxLen, right - left + 1);
            hash[c] = right + 1; // store next index (right+1)
            
            
        }
        return maxLen;
    }
}