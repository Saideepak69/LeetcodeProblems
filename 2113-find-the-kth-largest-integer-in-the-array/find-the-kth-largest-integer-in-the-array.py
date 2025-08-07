class Solution:
    def kthLargestNumber(self, nums: List[str], k: int) -> str:
        mpp = []
        for n in nums:
            mpp.append([n,int(n)])
        mpp.sort(key=lambda x:x[1], reverse=True)
        return mpp[k-1][0]