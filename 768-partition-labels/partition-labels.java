class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans = new ArrayList<>();
        int n = s.length();
        int[] firstOccurance = new int[26];
        int[] lastOccurance = new int[26];
        Arrays.fill(firstOccurance, -1);
        for (int i = 0; i < n; i++) {
            int index = s.charAt(i) - 'a';
            if (firstOccurance[index] < 0) {
                firstOccurance[index] = i;
            }
            lastOccurance[index] = i;
        }
        int partitionStart = 0;
        int partitionEnd = 0;
        for (int i = 0; i < n; i++) {
            int curr = s.charAt(i) - 'a';
            if (partitionEnd < firstOccurance[curr]) {
                ans.add(partitionEnd - partitionStart + 1);
                partitionStart = i;
                partitionEnd = i;
            }
            partitionEnd = Math.max(partitionEnd, lastOccurance[curr]);
        }
        if (partitionEnd - partitionStart + 1 > 0) {
            ans.add(partitionEnd - partitionStart + 1);
        }
        return ans;
    }
}