class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
        int ld;
        int revNum=0;
        while(num>0){            
            revNum=(revNum*10)+(num%10);
            num=num/10;
        }
        return revNum==x;
    }
}