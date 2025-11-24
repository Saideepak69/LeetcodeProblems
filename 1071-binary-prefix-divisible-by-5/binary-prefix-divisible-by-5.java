class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> res = new ArrayList<>();
        int x = 0;
        for(int n: nums){
            x = ((x << 1) + n) % 5;
            res.add(x == 0);
        }
        return res;
    }
}