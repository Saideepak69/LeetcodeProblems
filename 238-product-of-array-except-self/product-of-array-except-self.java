class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int zeroInd = 0;
        int zeroes = 0;
        int prod = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                zeroInd = i;
                zeroes++;
                continue;
            }  
            prod *= nums[i];
        }
        if(zeroes > 1) return res;
        if(zeroes == 1) {
            res[zeroInd] = prod;
            return res;
        }
        for(int i=0; i<n; i++){
            res[i] = prod / nums[i];
        }
        return res;
    }
}