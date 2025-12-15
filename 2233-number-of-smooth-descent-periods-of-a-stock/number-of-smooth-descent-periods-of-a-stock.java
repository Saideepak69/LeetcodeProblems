class Solution {
    public long getDescentPeriods(int[] prices) {
        long curr = 1;
        long tot = 1;
        for(int i=1; i<prices.length; i++){
            if(prices[i-1] - prices[i] == 1){
                curr++;
            }
            else{
                curr = 1;
            }
            tot += curr;
        }
        return tot;
    }
}