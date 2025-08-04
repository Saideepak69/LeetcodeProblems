from bisect import bisect_right
class Solution:
    def minOperations(self, nums: List[int], queries: List[int]) -> List[int]:
        nums.sort()
        n = len(nums)
        prefixSum = [0]*n
        prefixSum[0] = nums[0]
        for i in range(1, n):
            prefixSum[i] = prefixSum[i-1] + nums[i]

        totalSum = prefixSum[-1]
        res = []
        for q in queries:
            idx = bisect_right(nums, q)
            leftSum = prefixSum[idx - 1] if idx > 0 else 0
            rightSum = totalSum - leftSum
            leftCount = idx
            rightCount = n - idx
            tot = (q * leftCount - leftSum) + (rightSum - q * rightCount)
            res.append(tot)
        return res
