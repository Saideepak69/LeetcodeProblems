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
    int cnt = 0;
    private void calculate_sum(TreeNode root, long target, ArrayList<Integer> path){
        if (root == null)return;

        path.add(root.val);
            
        long sum = 0;
        for (int i = path.size() - 1; i >= 0; i--) {
            sum += path.get(i);
            if (sum == target) cnt++;
        }

        calculate_sum(root.left, target, new ArrayList<>(path));
        calculate_sum(root.right, target, new ArrayList<>(path));
    }

    public int pathSum(TreeNode root, int targetSum) {
        calculate_sum(root, (long) targetSum, new ArrayList<>());
        return cnt;
    }
}