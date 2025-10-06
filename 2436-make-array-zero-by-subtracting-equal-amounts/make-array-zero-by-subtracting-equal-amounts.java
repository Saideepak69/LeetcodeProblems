class Solution {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int cnt=1;
        if(nums[0] == 0) cnt = 0;
        for(int i=0; i<n-1; i++){
            if(nums[i+1] - nums[i] > 0) cnt++;
        }
        return cnt;
    }
}