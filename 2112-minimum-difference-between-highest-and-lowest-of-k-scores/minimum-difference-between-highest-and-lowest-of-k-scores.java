class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        for(int i=k-1; i<nums.length; i++){
            minDiff = Math.min(minDiff, nums[i] - nums[i-k+1]);
        }
        return minDiff == Integer.MAX_VALUE ? 0 : minDiff;
    }
}