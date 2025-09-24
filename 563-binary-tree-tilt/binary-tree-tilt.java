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
    public int tot;
    private int dfs(TreeNode root, int sum){
        if(root == null) return 0;
        int leftSum = dfs(root.left, sum);
        int rightSum = dfs(root.right, sum);
        sum = root.val + leftSum + rightSum;
        tot += Math.abs(leftSum - rightSum);
        return sum;
    }
    public int findTilt(TreeNode root) {
        int res = dfs(root, 0);
        return tot;
    }
}