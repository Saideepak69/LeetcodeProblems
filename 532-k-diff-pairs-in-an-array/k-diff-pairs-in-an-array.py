class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        nums.sort()
        find = set()
        n = len(nums)
        arr = []
        for i in range(n):
            value = nums[i] - k
            if value in find:
                arr.append([nums[i], value])
            find.add(nums[i])
        set_arr = set()
        for pair in arr:
            set_arr.add(tuple(pair))
        return len(set_arr)