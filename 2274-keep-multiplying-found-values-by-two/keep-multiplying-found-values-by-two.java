class Solution {
    public int findFinalValue(int[] nums, int original) {
        int n = nums.length;
        int temp=original;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i]==temp){
                temp=temp*2;
            }
        }
        return temp;
    }
}