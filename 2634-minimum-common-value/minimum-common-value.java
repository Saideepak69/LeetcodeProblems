class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> st = new HashSet<>();
        for(int n: nums1){
            st.add(n);
        }   
        int minVal = Integer.MAX_VALUE;
        for(int n: nums2){
            if(st.contains(n)){
                minVal = Math.min(minVal, n);
            }
        }
        return minVal == Integer.MAX_VALUE ? -1 : minVal;
    }
}