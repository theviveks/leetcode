class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int lastDigit;
        int revNo=0;
        while(temp>0){
            lastDigit=temp%10;
            revNo=(revNo*10)+lastDigit;
            temp=temp/10;
        }
        return x==revNo;
    }
}