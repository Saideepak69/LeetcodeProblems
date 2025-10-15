class Solution:
    def maxIncreasingSubarrays(self, nums: List[int]) -> int:
        n = len(nums)
        store = []
        cnt = 1
        for i in range(n-1):
            if nums[i] < nums[i+1]:
                cnt+=1
            else:
                store.append(cnt)
                cnt = 1
        store.append(cnt)
        minAm = float('inf')
        print(store)
        maxCon = float('-inf')
        for i in range(len(store)-1):
            minAm = min(store[i], store[i+1])
            maxCon = max(maxCon, minAm)
        for i in range(len(store)):
            value = store[i] % 2
            store[i] -= value
            maxCon = max(maxCon, store[i]//2)
        return maxCon if maxCon != float('-inf') else 1
