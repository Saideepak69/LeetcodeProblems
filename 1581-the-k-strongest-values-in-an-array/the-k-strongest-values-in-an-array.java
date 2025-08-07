class Solution {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        int mid = (n-1)/2;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
      int diff = Math.abs(arr[mid] - b) - Math.abs(arr[mid] - a);
      return diff != 0 ? diff : b - a;
  });
        int[] nums = new int[k];
        for(int i=0; i<n; i++){
            pq.add(arr[i]);
        }
        for(int i=0; i<k; i++){
            nums[i]=pq.peek();
            pq.poll();
        }
        return nums;
    }
}