class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int[] rel = new int[n];
        for (int i = 0; i < n; i++) {
            rel[i] = i + 1;
        }
        HashMap<Integer,Integer> mpp=new HashMap<>();
        ArrayList<Integer> skibid = new ArrayList<>();
        for(int i=0; i<n; i++){
            mpp.put(nums[i], mpp.getOrDefault(nums[i],0)+1);
            if(mpp.get(nums[i]) > 1) skibid.add(nums[i]);
        }
        for(int i=0; i<n; i++){
            if(!mpp.containsKey(rel[i])) skibid.add(rel[i]);
        }
        int[] finale=new int[skibid.size()];
        for(int i=0; i<skibid.size(); i++){
            finale[i] = skibid.get(i);
        }
        return finale;
    }
}