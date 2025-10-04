class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0, right = n-1, maxWater=0;
        while(left<=right){
            int minLen = right-left;
            maxWater = Math.max(maxWater, minLen * Math.min(height[left], height[right]));
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxWater;
    }
}