class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        nums.sort()
        n = len(nums)
        cnt = 1
        if(nums[0] == 0):
            cnt = 0
        for i in range(n-1):
            if(nums[i+1] - nums[i] > 0):
                cnt+=1
        return cnt