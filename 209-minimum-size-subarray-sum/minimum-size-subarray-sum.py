class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        currSum = 0
        n=len(nums)
        j = 0
        minLen = float('inf')
        for i in range(n):
            currSum += nums[i]
            while currSum >= target:
                currSum -= nums[j]
                minLen = min(minLen, i-j+1)
                j+=1
        return 0 if minLen == float('inf')else minLen