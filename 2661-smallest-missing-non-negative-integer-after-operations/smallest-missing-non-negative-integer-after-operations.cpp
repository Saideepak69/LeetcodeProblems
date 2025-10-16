class Solution {
public:
    int findSmallestInteger(vector<int>& nums, int value) {
        long long n = nums.size(), x, res = 0;
        vector<int> remainder(value, 0);
        for(int i=0; i<n; i++){
            x = ((nums[i] % value) + value) % value;
            remainder[x]++;
        }
        while(remainder[res % value]--) res++;
        return res;
    }
};