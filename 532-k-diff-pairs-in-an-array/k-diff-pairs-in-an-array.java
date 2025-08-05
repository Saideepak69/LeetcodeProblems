class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        Set<Integer> find = new HashSet<>();
        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i] - k;
            if (find.contains(value)) {
                arr.add(Arrays.asList(nums[i], value));
            }
            find.add(nums[i]);
        }

        Set<List<Integer>> setArr = new HashSet<>();
        for (List<Integer> pair : arr) {
            setArr.add(pair);
        }

        return setArr.size();
    }
}