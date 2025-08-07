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
    private boolean CheckBST(TreeNode root, long max, long min){
        if(root==null) return true;
        if(!(root.val>min && root.val<max)) return false;
        return CheckBST(root.left, root.val, min) && CheckBST(root.right, max, root.val);
    }
    public boolean isValidBST(TreeNode root) {
        return CheckBST(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }
}