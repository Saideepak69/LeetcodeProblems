class Solution {
    public int maxFrequency(int[] nums, int k, int numOperations) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> mpp=new HashMap<>();
        int i = 0, j = 0, res = 0, n = nums.length;
        for(int a: nums){
            while(i < n && nums[i] <= a + k){
                mpp.put(nums[i], mpp.getOrDefault(nums[i],0)+1);
                i++;
            }
            while(j < n && nums[j] < a - k){
                mpp.put(nums[j], mpp.get(nums[j])-1);
                j++;
            }
            int curr = Math.min(i - j, mpp.getOrDefault(a, 0) + numOperations);
            res = Math.max(res, curr);
        }
        for (i = 0, j = 0; j < n; j++) {
            while (nums[i] + k + k < nums[j]) {
                i++;
            }
            res = Math.max(res, Math.min(j - i + 1, numOperations));
        }
        return res;
    }
}