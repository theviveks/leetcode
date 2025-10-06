class Solution {
    public int reverse(int x) {
        return reverseHelper(x, 0);
    }

    private int reverseHelper(int x, int rev) {
        if (x == 0) {
            return rev;
        }

        int ld = x % 10;

        if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
            return 0;
        }

        return reverseHelper(x / 10, rev * 10 + ld);
    }
}
