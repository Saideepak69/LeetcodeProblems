class DataStream {
    Map<Integer,Integer> mpp;
    int value, k, ind, lastBreak;
    public DataStream(int value, int k) {
        mpp = new HashMap<>();
        this.value = value;
        this.k = k;
    }
    
    public boolean consec(int num) {
        ind++;
        if (num != value) {
            lastBreak = ind;
        }

        return ind - lastBreak >= k;
    }
}

/**
 * Your DataStream object will be instantiated and called as such:
 * DataStream obj = new DataStream(value, k);
 * boolean param_1 = obj.consec(num);
 */