class Solution {
    private int recursion(int[] nums, int n){
        if(nums.length == 1) return nums[0];
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<n-1; i++){
            arr.add((nums[i]+nums[i+1])%10);
        }
        int[] res = new int[arr.size()];
        for(int i=0; i<arr.size(); i++){
            res[i] = arr.get(i);
        }
        return recursion(res, res.length);
    }
    public int triangularSum(int[] nums) {
        return recursion(nums, nums.length);
    }
}