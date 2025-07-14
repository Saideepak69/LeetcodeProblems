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
    int maxDepth = -1;
    int leftMost = 0;
    private void traverse(TreeNode root, int depth){
        if(root==null)return;
        if(depth > maxDepth){
            maxDepth = depth;
            leftMost = root.val;
        }
        traverse(root.left,depth+1);
        traverse(root.right,depth+1);
    }
    public int findBottomLeftValue(TreeNode root) {
        traverse(root,0);
        return leftMost;
    }
}