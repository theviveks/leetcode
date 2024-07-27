class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> ans= new HashMap<>();
        for(int i=0;i<n;i++){
            int value=target-nums[i];
            if(ans.containsKey(value)){
                return new int[]{ans.get(value),i};
            }
            else{
                ans.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}