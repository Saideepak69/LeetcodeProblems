class Solution {
    public int longestSubarray(int[] nums) {
        int j=0;
        int zeroes=0;
        int tot=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                zeroes++;
            }
            if(zeroes>1){
                if(nums[j]==0){
                    zeroes--;
                }
                j++;
            }
            tot = Math.max(tot, i-j+1-zeroes);
        }
        return (tot == nums.length) ? tot-1:tot;
    }
}