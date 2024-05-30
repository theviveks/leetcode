class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap <Integer,Integer> mapp= new HashMap<>();
        for(int num:nums){
            mapp.put(num,mapp.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> ans = new ArrayList <>();
         for(int num : mapp.keySet()){
            if(mapp.get(num)>1){
                ans.add(num);
            }
        }       
        
          
        
        return ans; 
    }
}