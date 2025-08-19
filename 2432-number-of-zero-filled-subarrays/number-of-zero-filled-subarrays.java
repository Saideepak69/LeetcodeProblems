class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long tot_0 = 0;
        long zero_count = 0;
        int n = nums.length;
        long prevSum = 0;
        for(int i=0; i<n; i++){
            if(nums[i] == 0){
                zero_count = 1 + prevSum;
                prevSum = zero_count;
                tot_0 += zero_count;
            }
            else{
                zero_count=0;
                prevSum=0;
            }
        }
        return tot_0;
    }
}