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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        ArrayList<Integer> arr = new ArrayList<>();
        if(root == null) return arr;
        TreeNode rightSide = null;
        while(!q.isEmpty()){
            int n = q.size();
            while(n-- > 0){
                TreeNode node = q.poll();
                if(node!=null){
                    rightSide = node;
                    if(node.left!=null) q.add(node.left);
                    if(node.right!=null) q.add(node.right);
                }
            }
            if(rightSide!=null) arr.add(rightSide.val);
        }
        return arr;
    }
}