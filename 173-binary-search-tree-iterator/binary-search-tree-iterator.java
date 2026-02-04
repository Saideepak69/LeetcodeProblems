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
class BSTIterator {

    public ArrayList<Integer> arr;
    public int i = 0;
    private void addNode(TreeNode root, ArrayList<Integer> arr){
        if(root == null) return;
        arr.add(root.val);
        addNode(root.left, arr);
        addNode(root.right, arr);
    }

    public BSTIterator(TreeNode root) {
        arr = new ArrayList<>();
        addNode(root, arr);
        Collections.sort(arr);
    }
    
    public int next() {
        return arr.get(i++);
    }
    
    public boolean hasNext() {
        return i != arr.size();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */