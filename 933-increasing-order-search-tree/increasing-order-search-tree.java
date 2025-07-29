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
    ArrayList<Integer> arr = new ArrayList<>();
    private void preorder(TreeNode root){
        if(root==null)return;
        arr.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
    public TreeNode increasingBST(TreeNode root) {
        preorder(root);
        int[] nums = new int[arr.size()];
        for(int i=0; i<arr.size(); i++){
            nums[i] = arr.get(i);
        }
        Arrays.sort(nums);
        TreeNode dummy = new TreeNode(0);
        TreeNode current = dummy;
        for (int val : nums) {
            current.right = new TreeNode(val);
            current = current.right;
        }
        return dummy.right;
    }
}