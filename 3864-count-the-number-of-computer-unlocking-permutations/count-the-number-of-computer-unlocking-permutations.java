class Solution {
    public int countPermutations(int[] complexity) {
        int first = complexity[0];
        int n=complexity.length;
        for(int i=1; i<n; i++){
            if(complexity[i] <= first) return 0;
        }
        long fact = 1;
        for(int i=2; i<n; i++){
            fact = (fact * i) % 1000000007;
        }
        return (int) fact;
    }
}