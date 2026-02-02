class Solution {
    public int deleteAndEarn(int[] nums) {
        int max = 0;
        Map<Integer,Integer> mpp = new HashMap<>();
        for(int n: nums){
            max = Math.max(max, n);
            mpp.put(n, mpp.getOrDefault(n,0)+1);
        }
        int[] dp = new int[max+1];
        dp[0] = mpp.getOrDefault(0, 0);
        dp[1] = mpp.getOrDefault(1, 0);
        for(int i=2; i<=max; i++){
            dp[i] = Math.max(i * mpp.getOrDefault(i, 0) + dp[i-2], dp[i-1]);
        }
        return dp[max];
    }
}