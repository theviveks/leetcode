class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        for(int i=n;i>=0;i--){
            for(int j=0;j<i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
    }
}