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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        traverse(root, 0, ans);
        return ans;
    }

    private void traverse(TreeNode node, int level, List<List<Integer>> ans) {
        if (node == null)
            return;
        if (ans.size() == level)
            ans.add(new ArrayList<>());
        if (level % 2 == 0)
            ans.get(level).add(node.val);
        else
            ans.get(level).add(0, node.val);
        traverse(node.left, level + 1, ans);
        traverse(node.right, level + 1, ans);
    }
}
