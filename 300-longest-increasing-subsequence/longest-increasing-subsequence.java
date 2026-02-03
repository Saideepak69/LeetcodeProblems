class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int maxSeq = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[j] > nums[i]){
                    dp[j] = Math.max(dp[j], 1 + dp[i]);         
                }
            }
            maxSeq = Math.max(maxSeq, dp[i]);
        }
        return maxSeq;
    }
}