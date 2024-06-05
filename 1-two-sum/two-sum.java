class Solution {
    public int[] twoSum(int[] nums, int target) {
       int n=nums.length;
       HashMap <Integer,Integer> result= new HashMap<>();
       for(int i=0;i<n;i++){
        int more=target-nums[i];
        if(result.containsKey(more)){
            return new int[]{result.get(more),i};
        }
        else{
            result.put(nums[i],i);
        }
       }
       return new int[]{-1};
    }
}