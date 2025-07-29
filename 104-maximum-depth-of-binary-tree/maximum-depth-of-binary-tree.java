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
    private int dfs(TreeNode root, int height){
        if(root == null)return 0;
        int left = dfs(root.left, height+1);
        int right = dfs(root.right, height+1);
        return 1+Math.max(left, right);
    }
    public int maxDepth(TreeNode root) {
        return dfs(root, 0);
    }
}