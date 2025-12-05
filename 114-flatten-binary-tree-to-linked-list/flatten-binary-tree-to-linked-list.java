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
    private void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        arr.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
    public void flatten(TreeNode root) {
        if(root == null) return;
        preOrder(root);
        TreeNode temp = root;
        temp.left = null;
        System.out.println(arr);
        for(int i=1; i<arr.size(); i++){
            temp.right = new TreeNode(arr.get(i));
            temp = temp.right;
        }
    }
}