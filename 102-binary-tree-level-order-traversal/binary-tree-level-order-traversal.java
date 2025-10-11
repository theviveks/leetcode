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
    public void dfs(TreeNode node,List<List<Integer>>ans, int level){
        if(node==null){
            return;
        }
        if (ans.size() == level) {
            ans.add(new ArrayList<>());
        }
        
        ans.get(level).add(node.val);
        dfs(node.left,ans,level+1);
        dfs(node.right,ans,level+1);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(root,ans,0);
        return ans;
    }
}