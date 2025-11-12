class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        Map<Character, Integer> mapp = new HashMap<>();
        int right = 0;
        int left = 0;
        while (right < n) {
            char c = s.charAt(right);
            if (mapp.containsKey(c)) {
                left = Math.max(mapp.get(c) + 1, left);
            }
            mapp.put(c, right);
            int len = right - left + 1;
            maxLen = Math.max(maxLen, len);
            right++;
        }
        return maxLen;
    }
}