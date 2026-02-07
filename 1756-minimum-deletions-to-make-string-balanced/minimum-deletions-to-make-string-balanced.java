class Solution {
    public int minimumDeletions(String s) {
        int n = s.length();
        int rightA = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a') rightA++;
        }

        int leftB = 0;
        int ans = rightA; 

        for (char c : s.toCharArray()) {
            if (c == 'a') {
                rightA--;          
            } else {
                leftB++;           
            }
            ans = Math.min(ans, leftB + rightA);
        }

        return ans;
    }
}