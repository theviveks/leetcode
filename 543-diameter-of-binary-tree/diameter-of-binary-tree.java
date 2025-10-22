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
    private int maxDia = 0;

    private int helper(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int lh = helper(node.left);
        int rh = helper(node.right);
        int currDia = lh + rh;
        maxDia = Math.max(maxDia, currDia);

        return 1 + Math.max(lh, rh);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        helper(root);
        return maxDia;
    }
}