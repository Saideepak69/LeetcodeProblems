class Solution {
    public int maxFrequency(int[] nums, int k) {
        int left = 0; 
        long tot = 0, res = 0;
        Arrays.sort(nums);
        int n = nums.length;
        for(int right=0; right<n; right++){ 
            tot += nums[right];
            while(nums[right] * (right - left + 1L) > tot + k){
                tot -= nums[left];
                left++;
            }
            res = Math.max(res, right-left+1L);
        }
        return (int) res;
    }
}