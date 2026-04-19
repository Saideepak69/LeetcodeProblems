class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int j = nums2.length-1;
        int i = nums1.length-1;
        int maxLen = 0;
        while(j >= 0 && i >= 0){
            if(nums1[i] <= nums2[j]){
                maxLen = Math.max(maxLen, j - i);
                i--;
            }
            else{
                j--;
            }
        }
        return maxLen;
    }
}