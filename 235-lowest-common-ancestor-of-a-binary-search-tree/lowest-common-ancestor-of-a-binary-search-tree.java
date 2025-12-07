/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

    private void dfs(TreeNode root, ArrayList<Integer> res){
        if(root == null) return;
        res.add(root.val);
        arr.add(res);
        dfs(root.left, new ArrayList<>(res));
        dfs(root.right, new ArrayList<>(res));
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<Integer> pathP = null;
        ArrayList<Integer> pathQ = null;
        
        dfs(root, new ArrayList<>());

        for(ArrayList<Integer> path : arr) {
            if(!path.isEmpty() && path.get(path.size() - 1) == p.val) pathP = path;
            if(!path.isEmpty() && path.get(path.size() - 1) == q.val) pathQ = path;
        }

        Integer commonVal = null;
        if(pathP != null && pathQ != null) {
            int len = Math.min(pathP.size(), pathQ.size());
            for(int i = 0; i < len; i++) {
                if(pathP.get(i).equals(pathQ.get(i))) {
                    commonVal = pathP.get(i);
                } else {
                    break;
                }
            }
        }

        return findNode(root, commonVal);
    }

    private TreeNode findNode(TreeNode root, Integer val) {
        if (root == null || val == null) return null;
        if (root.val == val) return root;
        TreeNode left = findNode(root.left, val);
        return (left != null) ? left : findNode(root.right, val);
    }
}