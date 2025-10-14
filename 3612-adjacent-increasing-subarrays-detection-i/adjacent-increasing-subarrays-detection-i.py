class Solution:
    def hasIncreasingSubarrays(self, nums: List[int], k: int) -> bool:
        cnt = 1
        n = len(nums)
        records = []
        if k == 1:
            return True
        for i in range(n-1):
            if nums[i] < nums[i+1]:
                cnt+=1
            else:
                cnt=1
            if cnt - k >= 0:
                records.append(i+1)
        for rec in records:
            if rec - k in records:
                return True
        print(records)
        return False