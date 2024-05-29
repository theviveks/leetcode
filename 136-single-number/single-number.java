class Solution {
    public int singleNumber(int[] nums) {
        HashMap <Integer,Integer> result= new HashMap<>();
        for(int i=0;i<nums.length;i++){
           result.put(nums[i],result.getOrDefault(nums[i],0)+1);
        } 
        for(int i=0;i<nums.length;i++ ){
            if(result.get(nums[i])==1){
                return nums[i];
            }
        }
        return -1;
    }
}