class Solution:
    def maxSubarraySumCircular(self, nums: List[int]) -> int:
        total = 0
        maxSum = nums[0]
        minSum = nums[0]
        currMax = 0
        currMin = 0
        for n in nums:
            currMax = max(currMax + n, n)
            maxSum = max(maxSum, currMax)
            currMin = min(currMin + n, n)
            minSum = min(minSum, currMin)
            total += n
        return max(maxSum, total - minSum) if maxSum > 0 else maxSum

