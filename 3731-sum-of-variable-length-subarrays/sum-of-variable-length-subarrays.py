class Solution:
    def subarraySum(self, nums: List[int]) -> int:
        n=len(nums)
        prefixSum = [0]*(n)
        prefixSum[0]=nums[0]
        for i in range(1, n):
            prefixSum[i] = prefixSum[i-1] + nums[i]
        tot = 0
        print(prefixSum)
        for i in range(n):
            value = max(0, i-nums[i])
            if value == 0:
                tot += prefixSum[i]
            else:
                tot += prefixSum[i] - prefixSum[value-1]
        return tot