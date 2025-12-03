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
    private void dfs(TreeNode root, ArrayList<Integer> arr){
        if(root == null){
            return;
        }
        arr.add(root.val);
        int max = Integer.MIN_VALUE;
        for(int a: arr){
            max = Math.max(max, a);
        }
        if(root.val >= max) tot++;
        dfs(root.left, new ArrayList<>(arr));
        dfs(root.right, new ArrayList<>(arr));
    }
    public int goodNodes(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(Integer.MIN_VALUE);
        dfs(root, arr);
        return tot;
    }
}