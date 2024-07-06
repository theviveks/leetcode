class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];
        for (int i = 2 * n - 1; i >= 0; i--) {
            while (!st.empty() && st.peek() <= nums[i % n]) {
                st.pop();
            }
            if (st.empty()) {
                nge[i % n] = -1;
            } else {
                nge[i % n] = st.peek();
            }
            st.push(nums[i % n]);
        }
        return nge;
    }
}