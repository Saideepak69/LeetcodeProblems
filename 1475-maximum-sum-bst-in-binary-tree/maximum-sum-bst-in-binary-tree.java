class Solution {
    int maxSum = 0;

    private int[] dfs(TreeNode root){
        if(root == null) return new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE, 0, 1};
        // {min, max, sum, isBST}

        int[] left = dfs(root.left);
        int[] right = dfs(root.right);

        // check BST
        if(left[3] == 1 && right[3] == 1 && root.val > left[1] && root.val < right[0]){
            int sum = root.val + left[2] + right[2];
            maxSum = Math.max(maxSum, sum);

            int min = Math.min(root.val, left[0]);
            int max = Math.max(root.val, right[1]);

            return new int[]{min, max, sum, 1};
        }

        return new int[]{0, 0, 0, 0}; // not BST
    }

    public int maxSumBST(TreeNode root) {
        dfs(root);
        return maxSum;
    }
}