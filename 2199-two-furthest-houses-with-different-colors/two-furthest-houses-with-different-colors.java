class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int a = n - 1, b = 0;
        int maxLen = 0;
        int i = 0;

        while (a >= 0) {
            if (colors[i] != colors[a]) {
                maxLen = Math.max(maxLen, a - i);
                break;
            } else {
                a--;
            }
        }

        i = n - 1;
        while (b < n) {
            if (colors[i] != colors[b]) {
                maxLen = Math.max(maxLen, i - b);
                break;
            } else {
                b++;
            }
        }

        return maxLen;
    }
}