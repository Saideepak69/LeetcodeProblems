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
    private int index;
    private Map<Integer, Integer> mpp = new HashMap<>();
    private TreeNode create(int[] preorder, int start, int end){
        if(start>end) return null;
        int value = preorder[index++];
        TreeNode root = new TreeNode(value);
        int mid = mpp.get(value);
        root.left = create(preorder, start, mid-1);
        root.right = create(preorder, mid+1, end);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0; i<inorder.length; i++){
            mpp.put(inorder[i], i);
        }
        TreeNode res = create(preorder, 0, preorder.length-1);
        return res;
    }
}