

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;

        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        TreeNode lastVisited = null;

        while (curr != null || !st.isEmpty()) {
            // Go as left as possible
            while (curr != null) {
                st.push(curr);
                curr = curr.left;
            }

            TreeNode peekNode = st.peek();

            // If right child exists and hasn't been visited yet
            if (peekNode.right != null && lastVisited != peekNode.right) {
                curr = peekNode.right;
            } else {
                st.pop();
                ans.add(peekNode.val);
                lastVisited = peekNode;
            }
        }

        return ans;
    }
}
