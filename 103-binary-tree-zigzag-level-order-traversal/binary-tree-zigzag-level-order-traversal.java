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
        List<List<Integer>> result = new ArrayList<>();
    if (root == null) {
        return result;
    }

    Queue<TreeNode> nodesQueue = new LinkedList<>();
    nodesQueue.offer(root);
    boolean leftToRight = true;

    while (!nodesQueue.isEmpty()) {
        int size = nodesQueue.size();
        List<Integer> row = new ArrayList<>(size);

        for (int i = 0; i < size; i++) {
            TreeNode node = nodesQueue.poll();
            // Add elements to the end of the list
            row.add(node.val);

            if (node.left != null) {
                nodesQueue.offer(node.left);
            }
            if (node.right != null) {
                nodesQueue.offer(node.right);
            }
        }
        // Adjust the order based on zigzag
        if (!leftToRight) {
            Collections.reverse(row);
        }
        leftToRight = !leftToRight;
        result.add(row);
    }

    return result;
    }
}