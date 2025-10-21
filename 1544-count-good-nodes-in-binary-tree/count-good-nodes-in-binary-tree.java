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

    private void dfs(TreeNode node, int currMax, int[] ans) {
        if (node == null) {
            return;
        }
        if (node.val >= currMax) {
            ans[0]++;
            currMax = node.val;
        }
        dfs(node.left, currMax, ans);
        dfs(node.right, currMax, ans);

    }

    public int goodNodes(TreeNode root) {
        int[] ans = new int[1];
        dfs(root, root.val,ans);
        return ans[0];
    }
}