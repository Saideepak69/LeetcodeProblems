class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        int median = n/2;
        Arrays.sort(nums);
        int sum=0;
        for(int i=0; i<n; i++){
            sum += Math.abs(nums[i] - nums[median]);
        }
        return sum;
    }
}