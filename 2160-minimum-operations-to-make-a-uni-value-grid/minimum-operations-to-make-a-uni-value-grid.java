class Solution {
    public int minOperations(int[][] grid, int x) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                arr.add(grid[i][j]);
            }
        }
        int rem = grid[0][0] % x;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] % x != rem) {
                    return -1;
                }
            }
        }
        int len = arr.size();
        Collections.sort(arr);
        int[] prefix = new int[len];
        int[] suffix = new int[len];
        prefix[0] = arr.get(0);
        suffix[len-1] = arr.get(len-1);

        for (int i = 1; i < len; i++) {
            prefix[i] = prefix[i-1] + arr.get(i);
            suffix[len-i-1] = suffix[len-i] + arr.get(len-i-1);
        }
        int minLen = Integer.MAX_VALUE;

        for (int i = 0; i < len; i++) {
            int leftMove = 0;
            if (i > 0) {
                leftMove = (arr.get(i) * i - prefix[i-1]) / x;
            }

            int rightMove = 0;
            if (i < len - 1) {
                rightMove = (suffix[i+1] - arr.get(i) * (len - i - 1)) / x;
            }

            minLen = Math.min(minLen, leftMove + rightMove);
        }
        return minLen;
    }
}