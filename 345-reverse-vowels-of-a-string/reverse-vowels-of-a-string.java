class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;
        String vowels = "aeiouAEIOU";

        while (i < j) {
            while (i < j && !vowels.contains(chars[i] + ""))
                i++;
            while (i < j && !vowels.contains(chars[j] + ""))
                j--;

            if (i < j) {
                char temp = chars[i]; 
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
        }

        return new String(chars);
    }
}