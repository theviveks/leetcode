class Solution {
    public boolean wordPattern(String pattern, String s) {
        String words[]= s.split(" ");
        if(words.length!=pattern.length()){
            return false;
        }
        HashMap <Character,String> ans= new HashMap<>();
        int n=pattern.length();
        for(int i=0;i<n;i++){
            char c=pattern.charAt(i);
            if(ans.containsKey(c)){
                if(!ans.get(c).equals(words[i])){
                    return false;
                }
            }
            else{
                if(ans.containsValue(words[i])){
                    return false;
                }
                else{
                    ans.put(c,words[i]);
                }
            }
        }
        return true;
    }
}