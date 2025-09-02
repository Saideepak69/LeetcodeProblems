class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Long maxSum = 0L;
        Long totSum = 0L;
        Map<Integer,Integer> mpp = new HashMap<>();
        int j = 0;
        for(int i=0; i<nums.length; i++){
            mpp.put(nums[i], mpp.getOrDefault(nums[i],0)+1);
            totSum+=(long)nums[i];
            while(i-j+1>k){
                mpp.put(nums[j], mpp.get(nums[j])-1);
                totSum-=(long)nums[j];
                if(mpp.get(nums[j]) == 0){
                    mpp.remove(nums[j]);
                }
                j++;
            }
            if(mpp.size() == k){
                maxSum = Math.max(maxSum, totSum);
            }
        }
        return maxSum;
    }
}