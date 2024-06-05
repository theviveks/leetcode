class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList <Integer> ans= new ArrayList <>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                ans.add(nums[i]);
            }
        }
        for(int i=0;i<ans.size();i++){
            nums[i]=ans.get(i);
        }
        for(int i=ans.size();i<n;i++){
            nums[i]=0;
        }
    }
}