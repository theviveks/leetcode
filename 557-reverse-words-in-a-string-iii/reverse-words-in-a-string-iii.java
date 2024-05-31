class Solution {
    public String reverseWords(String s) {
        String[] arr = new StringBuilder(s).reverse().toString().split(" ");
        
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
            if (i > 0)sb.append(" ");
        }
        return sb.toString();
    }
}