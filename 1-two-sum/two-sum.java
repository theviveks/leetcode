class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> mapp= new HashMap<>();
        for(int i=0;i<n;i++){
            int value=target-nums[i];
             if(mapp.containsKey(value)){
                return new int[]{mapp.get(value),i};
             }
             else{
                mapp.put(nums[i],i);
             }
        }
        return new int[]{};
    }
}