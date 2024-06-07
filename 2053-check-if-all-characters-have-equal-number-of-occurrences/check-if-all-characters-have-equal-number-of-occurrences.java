class Solution {
    public boolean areOccurrencesEqual(String s) {
        int [] ans= new int [26];
        for(char c:s.toCharArray()){
            ans[c-'a']++;
        }
        int val=ans[s.charAt(0)-'a'];
        for(int n:ans){
            if(n!=0 && n!=val){
                return false;
            }
        }
        return true;
    }
}