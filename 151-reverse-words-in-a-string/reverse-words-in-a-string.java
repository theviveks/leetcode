class Solution {
    public void reverse(String[] words){
        int i=0;
        int j=words.length-1;
        while(i<j){
            String temp=words[i];
            words[i]=words[j];
            words[j]=temp;
            i++;
            j--;
        }
    }
    public String reverseWords(String s) {
        String words[]=s.trim().split("\\s+");
        reverse(words);
        return s.join(" ",words);
    }
}