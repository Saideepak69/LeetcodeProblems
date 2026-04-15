class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int minLen = Integer.MAX_VALUE;
        boolean flag = false;

        for (int i = 0; i < n; i++) {
            if (words[i].equals(target)) {
                flag = true;
                
                int forward = (i - startIndex + n) % n;
                int backward = (startIndex - i + n) % n;
                
                int dist = Math.min(forward, backward);
                minLen = Math.min(minLen, dist);
            }
        }

        return flag ? minLen : -1;
    }
}