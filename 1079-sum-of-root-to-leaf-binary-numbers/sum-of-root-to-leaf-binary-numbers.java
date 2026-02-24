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
    int tot = 0;
    private void traverse(TreeNode root, int sum){
        if(root==null)return;
        if(root.left==null && root.right==null){
            sum *= 2;
            sum += root.val;
            tot += sum;
        }
        sum = sum*2 + root.val;
        traverse(root.left,sum);
        traverse(root.right,sum);
    }
    public int sumRootToLeaf(TreeNode root) {
        traverse(root,0);
        return tot;
    }
}