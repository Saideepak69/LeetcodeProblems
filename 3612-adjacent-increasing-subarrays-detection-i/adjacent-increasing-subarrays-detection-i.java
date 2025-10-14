class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        HashSet<Integer> st = new HashSet<>();
        int cnt = 1;
        if(k == 1) return true;
        for(int i=0; i<nums.size()-1; i++){
            if(nums.get(i) < nums.get(i+1)){
                cnt++;
            }
            else{
                cnt=1;
            }
            if(cnt - k >= 0) st.add(i+1);
        }
        for (int rec : st) {
            if(st.contains(rec - k)){
                return true;
            }
        }
        return false;
    }
}