class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        HashMap <Integer,Integer> ans= new HashMap<>();
        for(int i=0;i<n;i++){
            ans.put(nums[i],ans.getOrDefault(nums[i],0)+1);
            
        }
        for(int i=0;i<n;i++){
            if(ans.get(nums[i])==1)
            return nums[i];
        }
        return -1;
    }
}