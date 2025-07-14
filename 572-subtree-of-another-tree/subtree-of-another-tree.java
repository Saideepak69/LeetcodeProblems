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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null) return false;
        if(root.val==subRoot.val){
            if(traverse(root,subRoot)) return true;
        }
        if(isSubtree(root.left,subRoot)) return true;
        if(isSubtree(root.right,subRoot)) return true;

        return false;
    }
    private boolean traverse(TreeNode root, TreeNode subRoot){
        if(root==null || subRoot == null){
            if(root!=null || subRoot!=null) return false;
            else return true;
        }
        if(root.val!=subRoot.val) return false;
        if(traverse(root.left,subRoot.left) ==false) return false;
        if(traverse(root.right,subRoot.right) ==false) return false;
        // traverse(root.right,subRoot.right);
        return true;
    }
}