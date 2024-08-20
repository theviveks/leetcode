class Solution {
    public int mySqrt(int x) {
        long low=1;
        long high=x;
        long ans=1;
        if(x==0) return 0;
        while(low<=high){
            long mid=(low+high)/2;
            if(mid*mid<=x){
                low=mid+1;
                ans=mid;
            }
            else{
                high=mid-1;
            }
        }
        return (int)high;
    }
}