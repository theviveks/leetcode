class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        boolean arr[]=new boolean[nums.length+1];
        List<Integer> res=new ArrayList<Integer>();
        for(int i:nums){
            if(arr[i]) res.add(i);
            else arr[i]=true;
        }
        return res;
    }
}