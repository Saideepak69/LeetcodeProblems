class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size();
        vector<int> res(n, 0);
        int prod = 1;
        int zeroes = 0;
        int zeroInd = 0;
        for(int i=0; i<n; i++){
            if(nums[i] == 0){
                zeroInd = i;
                zeroes++;
                continue;
            }
            prod *= nums[i];
        }
        if(zeroes > 1) return res;
        if(zeroes ==  1){
            res[zeroInd] = prod;
            return res;
        }
        for(int i=0; i<n; i++){
            res[i] = prod / nums[i];
        }
        return res;
    }
};