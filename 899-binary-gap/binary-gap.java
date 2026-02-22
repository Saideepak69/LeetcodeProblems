class Solution {
    public int binaryGap(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        int index = 0;
        while(n != 0){
            if(n%2 == 1){
                arr.add(index);
            }
            index++;
            System.out.println(n%2);
            n/=2;
        }
        int maxGap = 0;
        for(int i=0; i<arr.size()-1; i++){
            maxGap = Math.max(maxGap, arr.get(i+1) - arr.get(i));
        }
        System.out.println(arr);
        return maxGap;
    }
}