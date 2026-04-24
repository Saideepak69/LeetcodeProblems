class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int countL = 0, countR = 0;
        int dash = 0;
        for(char ch: moves.toCharArray()){
            if(ch == 'L'){
                countL++;
            }
            else if(ch == 'R'){
                countR++;
            }
            else{
                dash++;
            }
        }
        int maxLen = Integer.MIN_VALUE;
        if(countL >= countR){
            maxLen = Math.max(maxLen, countL + dash - countR);
            return maxLen;
        }
        else if(countR >= countL){
            maxLen = Math.max(maxLen, countR + dash - countL);
            return maxLen;
        }
        return dash;
    }
}