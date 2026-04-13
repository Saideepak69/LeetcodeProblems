class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int minLen = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target) minLen = Math.min(minLen, Math.abs(i - start)); 
        }
        return minLen;
    }
}