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

    private int dfs(TreeNode node, int[] maxSum) {
        if (node == null) {
            return 0;
        }
        int lh = Math.max(0, dfs(node.left, maxSum));
        int rh = Math.max(0, dfs(node.right, maxSum));
        int currMax = node.val + lh + rh;
        maxSum[0] = Math.max(maxSum[0], currMax);
        return node.val + Math.max(lh, rh);
    }

    public int maxPathSum(TreeNode root) {
        int[] maxSum = { Integer.MIN_VALUE };
        dfs(root, maxSum);
        return maxSum[0];
    }
}