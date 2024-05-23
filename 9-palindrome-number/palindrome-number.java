class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
        int ld;
        int revNum=0;
        while(num>0){
            ld=num%10;
            revNum=(revNum*10)+ld;
            num=num/10;
        }
        return revNum==x?true:false;
    }
}