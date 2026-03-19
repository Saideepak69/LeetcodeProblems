class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        // two parts lo cheyali!!!
        int top_left = grid[0][0];
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        int tot = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                dp[i][j] = grid[i][j];

                if(i > 0) dp[i][j] += dp[i-1][j];
                if(j > 0) dp[i][j] += dp[i][j-1];
                if(i > 0 && j > 0) dp[i][j] -= dp[i-1][j-1];

                if(dp[i][j] <= k) tot++;
            }
        }
        return tot;
    }
}