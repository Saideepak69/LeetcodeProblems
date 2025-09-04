class Solution:
    def hasGroupsSizeX(self, deck: List[int]) -> bool:
        mpp = {}
        dups = []
        for card in deck:
            mpp[card] = mpp.get(card, 0) + 1
        for key, value in mpp.items():
            if value in dups:
                continue
            dups.append([key, value])
        print(dups)
        def gcd(a, b):
            if b == 0:
                return a
            return gcd(b, a % b)
        commonGcd = dups[0][1]
        for i in range(1, len(dups)):
            commonGcd = gcd(commonGcd, dups[i][1])
        
        return commonGcd > 1