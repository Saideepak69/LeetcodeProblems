class Solution:
    def countSubstrings(self, s: str, c: str) -> int:
        mpp = {c:0}
        tot = 0
        prevSum = 0
        n = len(s)
        for i in range(n):
            if s[i] in mpp:
                mpp[s[i]]+=1
            if s[i] == c:
                tot = mpp[s[i]] + prevSum
                prevSum = tot
        return tot