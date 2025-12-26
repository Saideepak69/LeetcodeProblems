class Solution {
    public int bestClosingTime(String customers) {
        int maxTime = 0;
        int minPenality = 0;
        int prefix = 0;
        for(int i=0; i<customers.length(); i++){
            char ch = customers.charAt(i);
            prefix += ch == 'Y' ? -1 : 1;
            if(prefix < minPenality){
                minPenality = prefix;
                maxTime = i+1;
            }
        }
        return maxTime;
    }
}