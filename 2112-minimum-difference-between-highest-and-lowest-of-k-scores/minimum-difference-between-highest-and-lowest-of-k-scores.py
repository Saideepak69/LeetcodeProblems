class Solution:
    def minimumDifference(self, nums: List[int], k: int) -> int:
        n = len(nums)
        nums.sort()
        mini = nums[0]
        left = 0
        maxi = float('-inf')
        maxDiff = float('inf')
        for right in range(n):
            maxi = max(maxi, nums[right])
            while right - left + 1 > k:
                left+=1 
            if right - left + 1 == k:
                mini = nums[left]
                maxDiff = min(maxDiff, maxi - mini)
        return maxDiff