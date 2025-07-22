class Solution:
    def maximumUniqueSubarray(self, nums: List[int]) -> int:
        n = len(nums)
        from collections import deque
        q = deque([])
        mpp={}
        maxi = 0
        for i in range(n):
            mpp[nums[i]] = mpp.get(nums[i],0)+1
            q.append(nums[i])
            while(mpp[nums[i]] > 1):
                val = q.popleft()
                mpp[val]-=1
                if mpp[val] == 0:
                    del mpp[val]
            maxi = max(maxi, sum(q))
        return maxi