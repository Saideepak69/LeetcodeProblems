class Solution {
    public int binaryGap(int n) {
        int index = 0, prevInd = -1;
        int maxGap = 0;
        while(n != 0){
            if ((n & 1) == 1) {
                if (prevInd != -1) {
                    maxGap = Math.max(maxGap, index - prevInd);
                }
                prevInd = index;
            }
            index++;
            n>>=1;
        }
        return maxGap;
    }
}