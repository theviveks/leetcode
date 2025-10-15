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
    private int helper(TreeNode node, boolean[] ans) {
        if (node == null) {
            return 0;
        }
        int lh = helper(node.left, ans);
        int rh = helper(node.right, ans);
        if (Math.abs(lh - rh) > 1) {
            ans[0] = false;
        }
        return 1 + Math.max(lh, rh);
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean[] ans = { true };
        helper(root, ans);
        return ans[0];
    }
}