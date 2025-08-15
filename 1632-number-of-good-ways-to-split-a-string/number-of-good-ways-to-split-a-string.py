class Solution:
    def numSplits(self, s: str) -> int:
        n=len(s)
        mpp = {}
        for ch in s:
            mpp[ch] = mpp.get(ch, 0) + 1
        cnt = 0
        left_mpp = {}
        for ch in s:
            left_mpp[ch] = left_mpp.get(ch, 0) + 1
            mpp[ch] -= 1
            if mpp[ch] == 0:
                del mpp[ch]
            if len(left_mpp) == len(mpp):
                cnt += 1
        return cnt