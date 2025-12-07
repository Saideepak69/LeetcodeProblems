class Solution {
    public int countOdds(int low, int high) {
        if (low % 2 == 0) {
            low++;
        }
        
        // Adjust high to the last odd number <= high
        if (high % 2 == 0) {
            high--;
        }
        
        // If after adjustment low is greater than high, no odd numbers are in range
        if (low > high) {
            return 0;
        }
        
        // Number of odd numbers in range
        return (high - low) / 2 + 1;
    }
}