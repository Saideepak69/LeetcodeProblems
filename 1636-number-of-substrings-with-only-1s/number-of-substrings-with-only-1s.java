class Solution {
    public int numSub(String s) {
        long ones = 0;
        long tot = 0;
        long prevCount = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '1'){
                ones++;
                tot = (ones + prevCount) % 1000000007;
                prevCount = tot;
            }
            else{
                ones = 0;
            }
        }
        return (int)tot;
    }
}