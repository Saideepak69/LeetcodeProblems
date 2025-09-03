class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int j = 0;
        int n = nums.length;
        int tot = 0;
        int prevCount = 0;
        int oddCount = 0;
        for(int i=0; i<n; i++){
            if(nums[i]%2!=0){
                oddCount++;
                prevCount=0;
            }
            while(oddCount == k){
                prevCount++;
                if(nums[j]%2!=0) oddCount--;
                j++;
            }
            tot += prevCount;
        }
        return tot;
    }
}