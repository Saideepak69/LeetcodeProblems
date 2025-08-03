class Solution:
    def dominantIndex(self, nums: List[int]) -> int:
        mpp = {}
        n = len(nums)
        for i in range(n):
            mpp[nums[i]]=mpp.get(nums[i],i)
        nums.sort()
        maxInt = float('-inf')
        for i in range(n-1):
            maxInt = max(maxInt, nums[i]*2)
        if(nums[n-1] >= maxInt):
            return mpp.get(nums[n-1])
        return -1