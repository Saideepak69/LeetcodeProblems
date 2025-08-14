class Solution:
    def largestGoodInteger(self, num: str) -> str:
        n = len(num)
        mpp={}
        for i in range(n-2):
            if num[i] == num[i+1] == num[i+2]:
                mpp[num[i:i+3]] = mpp.get(num[i:i+2], int(num[i])*3)
        maxKey = ""
        maxValue = float('-inf')
        for key, value in mpp.items():
            if value > maxValue:
                maxValue = value
                maxKey = key
        return maxKey