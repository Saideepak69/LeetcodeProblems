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
    Map<Integer, Integer> mpp = new HashMap<>();
    TreeNode parentX = null, parentY = null;
    boolean value = false;
    private TreeNode assignLevel(TreeNode root, int level, int x, int y, TreeNode prev){
        if(root == null) return null;
        mpp.put(root.val, level);
        if(root.val == x) parentX = prev;
        if(root.val == y) parentY = prev;
        assignLevel(root.left, level+1, x, y, root);
        assignLevel(root.right, level+1, x, y, root);
        if (mpp.containsKey(x) && mpp.containsKey(y)) {
            if (mpp.get(x) == mpp.get(y) && parentX != parentY) {
                value = true;
            }
        }
        return root;
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode dummy = assignLevel(root, 0, x, y, null);
        return value;
    }
}