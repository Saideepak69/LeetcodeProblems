class Solution {
    public int reverseDegree(String s) {
        int tot = 0, n = s.length();
        for(int i=0; i<n; i++){
            tot += (('z' - 0) - s.charAt(i) - 0 + 1) * (i+1);
        }
        return tot;
    }
}