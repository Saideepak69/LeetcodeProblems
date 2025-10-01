class Solution:
    def numWaterBottles(self, numBottles: int, numExchange: int) -> int:
        def bottles(full, numEx):
            emptyBottles = full
            newBottles = emptyBottles // numEx
            remainBottles = full - newBottles*numEx
            arr.append(newBottles)
            return newBottles, remainBottles
        arr = [numBottles]
        while numBottles >= numExchange:
            res, rem = bottles(numBottles, numExchange)
            numBottles = res + rem
        return sum(arr)