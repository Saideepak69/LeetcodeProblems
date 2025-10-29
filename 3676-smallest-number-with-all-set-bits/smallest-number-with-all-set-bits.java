class Solution {
    private boolean onesOrNot(int num){
        while(num!=0){
            if(num%2 == 0) return false;
            num/=2;
        }
        return true;
    }
    public int smallestNumber(int n) {
        if(n == 1) return 1;
        for(int i=n; i<n*n; i++){
            if(onesOrNot(i)) return i;
        }
        return -1;
    }
}