class Solution {
    public int maximumLength(int[] nums, int k) {
        int max = 2;
        for(int i=0; i<k; i++){
            int[] dp = new int[k];
            for(int j=0; j<nums.length; j++){
                int mod = nums[j]%k;
                int pos = (i-mod+k) % k;
                dp[mod] = dp[pos]+1;
            }
            for(int c: dp){
                max = Math.max(max, c);
            }
        }
        return max;
    }
}