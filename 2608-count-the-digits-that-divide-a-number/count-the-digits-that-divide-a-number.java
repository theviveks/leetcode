class Solution {
    public int countDigits(int num) {
        int count=0;
        int lastDigit;
        int n=num;
        while(n>0){
            lastDigit=n%10;
            if(lastDigit>0){
                if(num%lastDigit==0){
                    count++;
                }
            }
            n=n/10;
        }
        return count;
    }
}