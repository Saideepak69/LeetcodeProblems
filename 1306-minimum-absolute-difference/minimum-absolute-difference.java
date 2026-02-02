class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            minDiff = Math.min(minDiff, arr[i+1] - arr[i]);
        }
        int start = 0;
        for(int i=0; i<n-1; i++){
            List<Integer> res = new ArrayList<>();
            if(arr[i+1] - arr[i] < minDiff){
                ans.remove(start);
                start++;
            }
            else if(arr[i+1] - arr[i] == minDiff){
                res.add(arr[i]);
                res.add(arr[i+1]);
                ans.add(res);
            }
        }
        return ans;
    }
}