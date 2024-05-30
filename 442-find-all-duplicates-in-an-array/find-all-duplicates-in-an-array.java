class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] ints = new int[nums.length + 1];
        for (int i : nums) {
            if (++ints[i] > 1) {
                ans.add(i);
            }
        }
        return ans;
    }
}