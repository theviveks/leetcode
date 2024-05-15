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
    public int pathSum(TreeNode root) {
        if(root == null) return 0;
        int lh = Math.max(0,pathSum(root.left));
        int rh = Math.max(0,pathSum(root.right));
        maxi = Math.max(maxi, lh + rh + root.val);
        return Math.max(lh, rh) + root.val;
    }
    int maxi = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        pathSum(root);
        return maxi;
    }

    
}