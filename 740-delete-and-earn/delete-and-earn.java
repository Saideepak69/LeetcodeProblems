class Solution {
    public int deleteAndEarn(int[] nums) {
        int max = 0;
        for(int n: nums){
            max = Math.max(max, n);
        }
        int[] map = new int[max+1];
        for(int n: nums){
            map[n] += n;
        }
        int[] dp = new int[max+1];
        dp[0] = map[0];
        dp[1] = map[1];
        for(int i=2; i<=max; i++){
            dp[i] = Math.max(map[i] + dp[i-2], dp[i-1]);
        }
        return dp[max];
    }
}