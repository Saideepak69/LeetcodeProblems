class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        Map<Integer, Long> mpp = new HashMap<>();
        Map<Integer, Long> rep = new HashMap<>();
        long[] res = new long[n];

        for (int i = 0; i < n; i++) {
            if (mpp.containsKey(nums[i])) {
                long sum = mpp.get(nums[i]);
                long cnt = rep.get(nums[i]);
                res[i] += cnt * i - sum;
                mpp.put(nums[i], sum + i);
            } else {
                mpp.put(nums[i], (long) i);
            }
            rep.put(nums[i], rep.getOrDefault(nums[i], 0L) + 1);
        }

        mpp.clear();
        rep.clear();

        for (int i = n - 1; i >= 0; i--) {
            if (mpp.containsKey(nums[i])) {
                long sum = mpp.get(nums[i]);
                long cnt = rep.get(nums[i]);
                res[i] += sum - cnt * i;
                mpp.put(nums[i], sum + i);
            } else {
                mpp.put(nums[i], (long) i);
            }
            rep.put(nums[i], rep.getOrDefault(nums[i], 0L) + 1);
        }

        return res;
    }
}