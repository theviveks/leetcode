class Solution {
    public int findFinalValue(int[] nums, int original) {
        int n = nums.length;
        Set<Integer> st = new HashSet<>();
        for(int num:nums){
            st.add(num);
        }
        while(st.contains(original)){
            original*=2;
        }
        return original;
    }
}