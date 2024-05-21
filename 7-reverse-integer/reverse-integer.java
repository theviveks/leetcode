class Solution {
    public int reverse(int x) {
        int revNumber=0;
        while(x!=0){
            int lastDigit=x%10;
            if(revNumber>Integer.MAX_VALUE/10 ||revNumber<Integer.MIN_VALUE/10){
               return 0;
            }
             revNumber = revNumber*10+lastDigit;
            x=x/10;
            
        }
        return (int)revNumber;
    }
}