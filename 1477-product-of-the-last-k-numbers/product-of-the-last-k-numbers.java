class ProductOfNumbers {

    //Stack<Integer> productOfNumbers;
    ArrayList<Integer> arr;
    int val;
    int zeroInd = -1;
    int i;
    int skbidi = Integer.MAX_VALUE;

    public ProductOfNumbers() {
        // productOfNumbers = new Stack<>();
        val = 1;
        i = -1;
        arr = new ArrayList<>();
    }
    
    public void add(int num) {
        i++;
        val *= num;
        if (num == 0) {
            val = 1;
            zeroInd = i;
        }
        // productOfNumbers.push(num);
        arr.add(val);
        skbidi = val;
    }
    
    public int getProduct(int k) {
        if (arr.size() - k <= zeroInd) {
            return 0;
        }

        if (arr.size() - k - 1 < 0) return skbidi;

        int divisor = arr.get(arr.size() - k - 1);
        if(divisor == 0) return skbidi;
        return skbidi / divisor;
    }
}
