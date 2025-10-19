class Solution {
    int maxGold = 0;
    private void dfs(int[][] grid, int row, int col, int currentGold){
        int n = grid.length, m = grid[0].length;
        if(row < 0 || row >= n || col < 0 || col >= m || grid[row][col] == 0) return;
        
        int gold = grid[row][col];
        currentGold += gold;
        maxGold = Math.max(maxGold, currentGold);
        
        grid[row][col] = 0; 
        dfs(grid, row-1, col, currentGold);
        dfs(grid, row+1, col, currentGold);
        dfs(grid, row, col-1, currentGold);
        dfs(grid, row, col+1, currentGold);
        grid[row][col] = gold;
    }
    public int getMaximumGold(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] != 0){
                    dfs(grid, i, j, 0);
                }
            }
        }
        return maxGold;
    }
}