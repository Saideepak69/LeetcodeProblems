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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        ArrayList<Integer> arr = new ArrayList<>();
        if(root == null) return 1;
        int i = 0;
        Map<Integer, Integer> mpp = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int max_level = 0;
        while(!q.isEmpty()){
            int n = q.size();
            int sum = 0;
            while(n-- > 0){
                TreeNode node = q.poll();
                sum += node.val;
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            i++;
            if(sum > max){
                max = sum;
                max_level = i;
            }
        }
        return max_level;
    }
}