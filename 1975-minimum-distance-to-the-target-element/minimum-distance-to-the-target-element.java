class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int ind = 0;
        int minLen = Integer.MAX_VALUE;
        for(int num: nums){
            if(num == target) minLen = Math.min(minLen, Math.abs(start - ind));
            ind++;
        }
        return minLen;
    }
}