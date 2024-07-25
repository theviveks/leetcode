class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        rrotate(nums,0,n-1);
        rrotate(nums,0,k-1);
        rrotate(nums,k,n-1);
    }
    void rrotate(int [] nums,int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}