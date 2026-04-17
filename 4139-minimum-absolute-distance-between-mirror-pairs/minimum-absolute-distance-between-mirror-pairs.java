class Solution {
    private int helper(int num){
        int rev = 0;
        while(num != 0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }
    public int minMirrorPairDistance(int[] nums) {
        Map<Integer,Integer> mpp = new HashMap<>();
        int minLen = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(mpp.containsKey(nums[i])){
                minLen = Math.min(minLen, i - mpp.get(nums[i]));
            }
            mpp.put(helper(nums[i]), i);
        }
        return minLen == Integer.MAX_VALUE ? -1 : minLen;
    }
}