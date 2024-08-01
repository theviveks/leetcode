class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> mapp= new HashMap<>();
        for(int i=0;i<n;i++){
            mapp.put(nums[i],mapp.getOrDefault(nums[i],0)+1);
        }
        for(int num:nums){
            if(mapp.get(num)>n/2){
                return num;
            }
        }
        return -1;
    }
}