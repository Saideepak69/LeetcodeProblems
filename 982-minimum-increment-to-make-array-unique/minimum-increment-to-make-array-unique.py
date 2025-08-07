class Solution:
    def minIncrementForUnique(self, nums: List[int]) -> int:
        nums.sort()
        tot = 0
        prev = nums[0]
        for i in range(1,len(nums)):
            if(nums[i] <= prev):
                tot = tot + (prev - nums[i]+1)
                prev+=1
            else:
                prev = nums[i]
        return tot