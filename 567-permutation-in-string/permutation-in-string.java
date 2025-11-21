class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        char[] ch1 = s1.toCharArray();
        Arrays.sort(ch1);
        String S1 = new String(ch1);
        for (int i = 0; i <= m - n; i++) {
            char[] ch2 = s2.substring(i, i + n).toCharArray();
            Arrays.sort(ch2);
            if (S1.equals(new String(ch2))) {
                return true;
            }
        }
        return false;
    }
}