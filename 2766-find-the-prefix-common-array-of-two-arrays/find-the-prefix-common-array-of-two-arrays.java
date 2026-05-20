class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] res = new int[n];
        res[0] = 0;
        res[n-1] = n;
        Set<Integer> st1 = new HashSet<>();
        Set<Integer> st2 = new HashSet<>();
        st1.add(A[0]);
        st2.add(B[0]);
        if(A[0] == B[0]) res[0] = 1;
        for(int i=1; i<n-1; i++){
            int cnt = 0;
            st1.add(A[i]);
            st2.add(B[i]);
            if(st1.contains(B[i])){
                cnt++;
            }
            if(st2.contains(A[i])){
                cnt++;
            }
            if(A[i] == B[i]){
                res[i] = 1 + res[i-1];
            }
            else{
                res[i] = res[i-1] + cnt;
            }
        }
        return res;
    }
}