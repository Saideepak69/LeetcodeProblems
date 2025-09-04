class Solution:
    def numPairsDivisibleBy60(self, time: List[int]) -> int:
        n=len(time)
        cnt=0
        mpp = {}
        for i in range(n):
            value = time[i] % 60
            compliment = (60 - value) % 60
            cnt+=mpp.get(compliment,0)
            mpp[value]=mpp.get(value,0)+1
        return cnt