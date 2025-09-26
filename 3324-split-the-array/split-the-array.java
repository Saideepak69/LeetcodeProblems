class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        int maxFreq = 0;
        for(int n: nums){
            mpp.put(n, mpp.getOrDefault(n,0)+1);
            maxFreq = Math.max(maxFreq, mpp.get(n));
            if(maxFreq > 2) return false;
        }
        return true;
    }
}