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

    private int helper(TreeNode node, int[] maxDia) {
        if (node == null) {
            return 0;
        }
        int lh = helper(node.left, maxDia);
        int rh = helper(node.right, maxDia);
        int currDia = lh + rh;
        maxDia[0] = Math.max(maxDia[0], currDia);

        return 1 + Math.max(lh, rh);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int[] maxDia = new int[1];
        helper(root, maxDia);
        return maxDia[0];
    }
}