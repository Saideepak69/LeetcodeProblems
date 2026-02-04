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

    public PriorityQueue<Integer> pq;
    public Iterator<Integer> value;
    public int i = 0;
    private void addNode(TreeNode root, PriorityQueue<Integer> pq){
        if(root == null) return;
        pq.add(root.val);
        addNode(root.left, pq);
        addNode(root.right, pq);
    }

    public BSTIterator(TreeNode root) {
        pq = new PriorityQueue<>();
        addNode(root, pq);
    }
    
    public int next() {
        return pq.poll();
    }
    
    public boolean hasNext() {
        return !pq.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */