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
    private String serialize(TreeNode node) {
        StringBuilder sb = new StringBuilder();
        serializeHelper(node, sb);
        return sb.toString();
    }

    private void serializeHelper(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append("#"); // null marker
            return;
        }
        sb.append("-#").append(node.val).append("-#");
        serializeHelper(node.left, sb);
        serializeHelper(node.right, sb);
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        String tree1 = serialize(root);
        String tree2 = serialize(subRoot);
        return tree1.contains(tree2);
    }
}
