class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int minDiff = Integer.MAX_VALUE;
        List<List<Integer>> ans = new ArrayList<>();
        int fake1 = Integer.MAX_VALUE, fake2 = Integer.MAX_VALUE;
        for(int i=0; i<n-1; i++){
            System.out.println(arr[i] + " " + arr[i+1]);
            if(arr[i+1] - arr[i] == minDiff){
                minDiff = arr[i+1] - arr[i];
                fake1 = Math.min(fake1, arr[i]);
                fake2 = Math.min(fake2, arr[i+1]);
            }
            else if (arr[i+1] - arr[i] < minDiff) {
                minDiff = arr[i+1] - arr[i];
                fake1 = arr[i];
                fake2 = arr[i+1];
            }
        }
        List<Integer> fake = new ArrayList<>();
        fake.add(fake1);
        fake.add(fake2);
        ans.add(fake);
        for(int i=1; i<n-1; i++){
            List<Integer> res = new ArrayList<>();
            if(arr[i+1] - arr[i] == minDiff){
                res.add(arr[i]);
                res.add(arr[i+1]);
                if(!ans.contains(res))
                    ans.add(res);
            } 
        }
        return ans;
    }
}