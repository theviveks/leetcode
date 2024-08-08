class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> mapp= new HashMap<>();
        int prefixSum=0, count=0;
        mapp.put(0,1);
        for(int i=0;i<n;i++){
            prefixSum+=nums[i];
            int target=prefixSum-k;
            count+=mapp.getOrDefault(target,0);
            mapp.put(prefixSum,mapp.getOrDefault(prefixSum,0)+1);

        }
        return count;
    }
}