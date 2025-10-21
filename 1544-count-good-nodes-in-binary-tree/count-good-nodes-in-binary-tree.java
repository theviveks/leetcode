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
    int ans = 0;

    private int dfs(TreeNode node, int currMax) {
        if (node == null) {
            return 0;
        }
        if (node.val >= currMax) {
            ans++;
            currMax = node.val;
        }
        dfs(node.left, currMax);
        dfs(node.right, currMax);
        return ans;

    }

    public int goodNodes(TreeNode root) {
        dfs(root, root.val);
        return ans;
    }
}