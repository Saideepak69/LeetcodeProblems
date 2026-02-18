class Solution {
    private ArrayList<Integer> converter(int n){
        ArrayList<Integer> arr = new ArrayList<>();
        while(n!=0){
            arr.add(n%2);
            n/=2;
        }
        return arr;
    }
    public boolean hasAlternatingBits(int n) {
        ArrayList<Integer> res = converter(n);
        for(int i=0; i<res.size()-1; i++){
            if(res.get(i) == res.get(i+1)) return false;
        }
        return true;
    }
}