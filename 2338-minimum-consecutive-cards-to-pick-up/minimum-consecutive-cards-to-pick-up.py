class Solution:
    def minimumCardPickup(self, cards: List[int]) -> int:
        n = len(cards)
        j = 0
        mpp = {}
        minLen = float('inf')
        freq = {}
        for i in range(n):
            freq[cards[i]] = freq.get(cards[i],0)+1
            if freq[cards[i]] > 1:
                minLen = min(minLen, i - mpp[cards[i]]+1)
            mpp[cards[i]] = i
        minLen = -1 if minLen == float('inf') else minLen
        return minLen