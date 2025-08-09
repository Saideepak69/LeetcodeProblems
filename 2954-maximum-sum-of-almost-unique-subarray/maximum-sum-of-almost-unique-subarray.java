class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        long sum = 0;
        int n=nums.size();
        Map<Integer,Integer> mpp = new HashMap<>();
        int j = 0;
        long maxSum = 0;
        for(int i=0; i<n; i++){
            sum += (long) nums.get(i);
            mpp.put(nums.get(i), mpp.getOrDefault(nums.get(i),0)+1);
            while(i - j + 1 > k){
                sum -= (long) nums.get(j);
                mpp.put(nums.get(j), mpp.get(nums.get(j))-1);
                if(mpp.get(nums.get(j)) == 0){
                    mpp.remove(nums.get(j));
                }
                j++;
            }
            if(i - j + 1 == k && mpp.size() >= m) maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}