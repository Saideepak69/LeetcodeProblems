class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        int n=nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] == 1) arr.add(i);
        }
        for (int j = 0; j + 1 < arr.size(); j++) {
            if(arr.get(j + 1)-arr.get(j)-1 < k) return false;
        }
        System.out.println(arr);
        return true;
    }
}