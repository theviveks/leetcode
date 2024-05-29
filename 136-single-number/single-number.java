class Solution {
    public int singleNumber(int[] nums) {
        HashMap <Integer,Integer> result= new HashMap<>();
        for(int i:nums){
           result.put(i,result.getOrDefault(i,0)+1);
        } 
        for(int i:nums ){
            if(result.get(i)==1){
                return i;
            }
        }
        return -1;
    }
}