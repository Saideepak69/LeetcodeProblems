class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        int n=nums.length;
        int maxFreq = 0;
        for(int i=0; i<n; i++){
            mpp.put(nums[i], mpp.getOrDefault(nums[i],0)+1);
            maxFreq = Math.max(maxFreq,mpp.get(nums[i]));
        }
        int cnt=0;
        for(Map.Entry<Integer,Integer> ent: mpp.entrySet()){
            if(ent.getValue() == maxFreq) cnt+=ent.getValue();
        }
        return cnt;
    }
}