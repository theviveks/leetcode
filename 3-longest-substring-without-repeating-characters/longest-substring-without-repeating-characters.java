class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        Map<Character, Integer> mapp = new HashMap<>();
        int left = 0;
        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);
            if (mapp.containsKey(c) && mapp.get(c) >= left) {
                left = Math.max(mapp.get(c) + 1,left);
            }
            mapp.put(c, right);
            int len = right - left + 1;
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }
}