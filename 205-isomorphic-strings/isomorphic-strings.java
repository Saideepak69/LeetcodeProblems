class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> mpp_s = new HashMap<>();
        Map<Character, Integer> mpp_t = new HashMap<>();
        int n = s.length();
        boolean Flag = true;
        for(int i=0; i<n; i++){
            mpp_s.put(s.charAt(i), mpp_s.getOrDefault(s.charAt(i), i));
            mpp_t.put(t.charAt(i), mpp_t.getOrDefault(t.charAt(i), i));
            if(mpp_s.get(s.charAt(i)) != mpp_t.get(t.charAt(i))) Flag = false;
        }
        return Flag;
    }
}