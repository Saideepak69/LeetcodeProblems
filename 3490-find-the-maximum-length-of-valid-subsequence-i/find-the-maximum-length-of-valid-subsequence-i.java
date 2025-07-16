class Solution {
    public int maximumLength(int[] nums) {
        int dp[] = new int[4];
	for (int currentParity = nums[0] & 1, i = dp[2 | currentParity] = dp[currentParity] = 1, length = nums.length; i < length; dp[currentParity |= 2] = Math.max(dp[currentParity], dp[currentParity ^ 1] + 1))
		dp[currentParity = nums[i++] & 1]++;
	return Math.max(Math.max(dp[0], dp[1]), Math.max(dp[2], dp[3]));
    }
}