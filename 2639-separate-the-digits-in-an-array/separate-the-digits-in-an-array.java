class Solution {
    public int[] separateDigits(int[] nums) {
        String st = "";
        for(int n: nums){
            st += String.valueOf(n);
        }
        int[] res = new int[st.length()];
        for(int i=0; i<st.length(); i++){
            res[i] = st.charAt(i) - '0';
        }
        return res;
    }
}