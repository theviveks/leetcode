/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Stack<TreeNode> st = new Stack<>();
        while (true) {
            if (root != null) {
                st.push(root);
                root = root.left;
            } else {
                if (st.isEmpty())
                    break;
                TreeNode current = st.pop();
                ans.add(current.val);
                root = current.right;

            }
        }
        return ans;
    }
}