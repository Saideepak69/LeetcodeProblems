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
    ArrayList<Long> arr = new ArrayList<>();
    private long dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        long left = dfs(root.left);
        long right = dfs(root.right);
        arr.add(root.val + left + right);
        return root.val + left + right;
    }
    public int maxProduct(TreeNode root) {
        long tot = dfs(root);
        long max = Long.MIN_VALUE;
        for(long a: arr){
            max = Math.max(max, (tot - a) * a);
        }
        return (int)(max % 1000000007);
    }
}