class Solution:
    def maximumsSplicedArray(self, nums1: List[int], nums2: List[int]) -> int:
        n = len(nums1)
        tot1 = sum(nums1)
        tot2 = sum(nums2)
        def maxSubarraySum(nums):
            maxSum = currSum = 0
            for i in range(len(nums)):
                currSum += nums[i]
                if currSum < 0:
                    currSum = 0
                maxSum = max(maxSum, currSum)
            return maxSum
        diff1 = [nums2[i]-nums1[i] for i in range(n)]
        diff2 = [nums1[i]-nums2[i] for i in range(n)]
        maxdiff1 = maxSubarraySum(diff1)
        maxdiff2 = maxSubarraySum(diff2)
        return max(tot1+maxdiff1, tot2+maxdiff2)
