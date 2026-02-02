class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int minDiff = Integer.MAX_VALUE;
        for(int i=0; i<n-1; i++){
            minDiff = Math.min(minDiff, arr[i+1] - arr[i]);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<n-1; i++){
            List<Integer> res = new ArrayList<>();
            if(arr[i+1] - arr[i] == minDiff){
                res.add(arr[i]);
                res.add(arr[i+1]);
                ans.add(res);
            }
        }
        return ans;
    }
}