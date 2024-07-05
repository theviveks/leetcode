class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        Stack<Character> st= new Stack<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
            }
            else if(st.isEmpty()){
                return false;
            }
            else if(c==')' && st.pop()!='(') return false;
            else if(c=='}' && st.pop()!='{') return false;
            else if(c==']' && st.pop()!='[') return false;
        }
        return st.isEmpty();
    }
}