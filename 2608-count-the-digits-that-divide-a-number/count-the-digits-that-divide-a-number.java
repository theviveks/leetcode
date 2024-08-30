class Solution {
    public int countDigits(int num) {
        int n = num;
        int revNum = 0;
        int count = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            if (n % lastDigit == 0) {
                count++;
            }
            num = num / 10;
        }
        return count;
    }
}