class Solution:
    def largestGoodInteger(self, num: str) -> str:
        maxSubstring = ""
        maxValue = float('-inf')
        n=len(num)
        for i in range(n-2):
            if num[i] == num[i+1] == num[i+2]:
                if(int(num[i])*3 > maxValue):
                    maxValue = int(num[i])*3
                    maxSubstring = num[i:i+3]
        return maxSubstring