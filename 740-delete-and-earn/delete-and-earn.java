class Solution {
    public int deleteAndEarn(int[] nums) {
        Arrays.sort(nums);
        int[] memo=new int[nums.length+1];
        Arrays.fill(memo,-1);
        return solve(nums,0,memo);
    }
    public static int solve(int[] nums,int index,int[] memo){
        if(index==nums.length){
            return 0;
        }
        if(memo[index]!=-1){
            return memo[index];
        }
        int curr_value=nums[index];
        int sum=0;
        int ind=index;
        while(ind<nums.length && nums[ind]==curr_value){
            sum=sum+curr_value;
            ind++;
        }
        int next=ind;
        while(next<nums.length && nums[next]==curr_value+1){
            next++;
        }
        int take=sum+solve(nums,next,memo);
        int skip=solve(nums,ind,memo);
        return memo[index]=Math.max(take,skip);
    }
}