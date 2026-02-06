class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int j = 0;
        int maxLen = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            while((long) nums[i] > (long) nums[j] * k){
                j++;
            }
            maxLen = Math.max(maxLen, i - j +1);
        }
        return n - maxLen;
    }
}