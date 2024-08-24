class Solution {
    public int lowerBound(int[] mat,int m,int x){
        Arrays.sort(mat);
        int low=0;
        int high=m-1;
        int ans=m;
        while(low<=high){
            int mid=(low+high)/2;
            if(mat[mid]>=x){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int index=-1;
        int countMax=-1;
        for(int i=0;i<n;i++){
           int count=m-(lowerBound(mat[i],m,1));
           if(count>countMax){
            countMax=count;
            index=i;
           }
        }
        return new int[]{index,countMax};        
    }
}