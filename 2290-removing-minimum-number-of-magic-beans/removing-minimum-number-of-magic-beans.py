class Solution:
    def minimumRemoval(self, beans: List[int]) -> int:
        beans.sort()
        tot = sum(beans)
        n = len(beans)

        prefixSum = [0]*n
        prefixSum[0] = beans[0]
        for i in range(1, n):
            prefixSum[i] = prefixSum[i-1] + beans[i]

        ans = float('inf')
        for i in range(n):
            delete_cost = prefixSum[i-1] if i > 0 else 0
            reduce_cost = tot - prefixSum[i] - beans[i] * (n - i - 1)
            cost = delete_cost + reduce_cost
            print(reduce_cost, delete_cost)
            ans = min(ans, cost)
        return ans