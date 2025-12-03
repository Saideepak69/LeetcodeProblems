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
    // Experiment first
    ArrayList<Long> arr = new ArrayList<>();
    private long bottomUP(TreeNode root, long sum) {
        if (root == null) return sum;
        long left = bottomUP(root.left, sum);
        long right = bottomUP(root.right, sum);
        arr.add(root.val + left + right);
        return root.val + left + right;
    }

    public int maxProduct(TreeNode root) {
        long res = bottomUP(root, 0);
        long maxProd = Long.MIN_VALUE;

        for (long a : arr) {
            maxProd = Math.max(maxProd, a * (res - a));
        }

        return (int)(maxProd % 1000000007);
    }
}