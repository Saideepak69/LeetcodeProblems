class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] dp = new int[n][m];
        for(int[] a: dp){
            Arrays.fill(a, -1);
        }
        return dfs(text1, text2, 0, 0, dp);
    }
    private int dfs(String s1, String s2, int i, int j, int[][] dp){
        if(i == s1.length() || j == s2.length()){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(s1.charAt(i) == s2.charAt(j)){
            dp[i][j] = 1 + dfs(s1, s2, i+1, j+1, dp);
            return dp[i][j];
        }
        int left = dfs(s1, s2, i+1, j, dp);
        int right = dfs(s1, s2, i, j+1, dp);
        dp[i][j] = Math.max(left, right);
        return dp[i][j];
    }
}