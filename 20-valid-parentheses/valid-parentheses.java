class Solution {
    public boolean isValid(String s) {
        Stack <Character> ans=new Stack<>();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(a=='{' || a=='[' || a=='('){
                ans.push(a);
            }
            else if(ans.empty()){
                return false;
            }
            else if(a=='}' && ans.pop()!='{') return false;
            else if(a==']' && ans.pop()!='[') return false;
            else if(a==')' &&ans.pop()!='(') return false;
        }
        return ans.empty();
    }
}