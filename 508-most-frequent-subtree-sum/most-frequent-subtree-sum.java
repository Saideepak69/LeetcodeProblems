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
    int max = 0;
    private int dfs(TreeNode root, int sum){
        if(root == null) return 0;
        int left = dfs(root.left,sum);
        int right = dfs(root.right,sum);
        sum = root.val + left + right;
        mpp.put(sum, mpp.getOrDefault(sum,0)+1);
        max = Math.max(max, mpp.get(sum));
        return sum;
    }
    public int[] findFrequentTreeSum(TreeNode root) {
        int to = dfs(root, 0);
        List<Integer> res = new ArrayList<>();
        
        for(Map.Entry<Integer, Integer> ent : mpp.entrySet()){
            if(ent.getValue() == max){
                res.add(ent.getKey());
            }
        }
        
        return res.stream().mapToInt(i -> i).toArray();
    }
}