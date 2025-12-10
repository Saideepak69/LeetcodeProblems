class Solution:
    def minimumCardPickup(self, cards: List[int]) -> int:
        n = len(cards)
        mpp = {}
        minLen = float('inf')
        for pos, val in enumerate(cards):
            if val in mpp:
                minLen = min(minLen, pos - mpp[val] + 1)
            mpp[val] = pos
        return -1 if minLen == float('inf') else minLen