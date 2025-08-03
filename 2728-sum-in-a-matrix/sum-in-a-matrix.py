class Solution:
    def matrixSum(self, nums: List[List[int]]) -> int:
        n = len(nums)
        m = len(nums[0])
        tot = 0
        for i in range(n):
            nums[i].sort(reverse=True)
        for i in range(m):
            maxi = 0
            for j in range(n):
                maxi = max(maxi, nums[j][i])
            tot += maxi
        return tot