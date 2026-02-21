class Solution {
    public boolean bitConvert(int n){
        int bits = 0;
        while(n!=0){
            bits+=n%2;
            n/=2;
        }
        if(bits <= 1) return false;
        int cnt = 0;
        for(int i=2; i<=(int)Math.sqrt(bits); i++){
            if(bits % i == 0){
                return false;
            }
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        int tot = 0;
        for(int i=left; i<=right; i++){
            if(bitConvert(i)){
                tot += 1;
            }
        }
        return tot;
    }
}