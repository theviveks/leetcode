public class Solution {
    public boolean isPalindrome(String s) {
        return isPalindromeHelper(s, 0, s.length() - 1);
    }

    private boolean isPalindromeHelper(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        
        char startChar = Character.toLowerCase(s.charAt(start));
        char endChar = Character.toLowerCase(s.charAt(end));

        if (!Character.isLetterOrDigit(startChar)) {
            return isPalindromeHelper(s, start + 1, end);
        }
        if (!Character.isLetterOrDigit(endChar)) {
            return isPalindromeHelper(s, start, end - 1);
        }

        if (startChar != endChar) {
            return false;
        }

        return isPalindromeHelper(s, start + 1, end - 1);
    }
}
