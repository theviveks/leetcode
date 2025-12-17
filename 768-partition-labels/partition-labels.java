class Solution {
    public List<Integer> partitionLabels(String s) {
        int n = s.length();
        List<Integer> ans = new ArrayList<>();
        int[] lastOccurance = new int[26];
        for (int i = 0; i < n; i++) {
            lastOccurance[s.charAt(i) - 'a'] = i;
        }
        int partitionStart = 0, partitionEnd = 0;
        for (int i = 0; i < n; i++) {
            partitionEnd = Math.max(partitionEnd, lastOccurance[s.charAt(i) - 'a']);
            if (i == partitionEnd) {
                ans.add(partitionEnd - partitionStart + 1);
                partitionStart = partitionEnd + 1;
            }
        }
        return ans;
    }
}