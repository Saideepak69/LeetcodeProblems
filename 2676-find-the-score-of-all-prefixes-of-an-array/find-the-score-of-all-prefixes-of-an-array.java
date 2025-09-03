class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n = nums.length;
        long[] res = new long[n];
        int max = Integer.MIN_VALUE;
        res[0] = (long) nums[0] + Math.max(max, nums[0]);
        max = Math.max(max, nums[0]);
        for(int i=1; i<n; i++){
            res[i] = (long) nums[i] + Math.max(max, nums[i]) + res[i-1];
            max = Math.max(max, nums[i]);
        }
        return res;
    }
}