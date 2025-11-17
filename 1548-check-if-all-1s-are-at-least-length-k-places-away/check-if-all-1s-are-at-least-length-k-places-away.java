class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        int n=nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] == 1) arr.add(i);
        }
        Collections.sort(arr);
        System.out.println(arr);
        for(int i=0; i<arr.size()-1; i++){
            if(arr.get(i+1)-arr.get(i)-1 < k) return false;
        }
        return true;
    }
}