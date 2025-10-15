class Solution {
public:
    int maxIncreasingSubarrays(vector<int>& nums) {
        vector<int> store;
        int cnt=1;
        int n=nums.size();
        for(int i=0; i<n-1; i++){
            if(nums[i] < nums[i+1]){
                cnt++;
            }
            else{
                store.push_back(cnt);
                cnt=1;
            }
        }
        store.push_back(cnt);
        int maxCon = INT_MIN;
        int minAm = INT_MAX;
        for(int i=0; i<store.size()-1; i++){
            minAm = min(store[i], store[i+1]);
            maxCon=max(maxCon, minAm);
        }
        for(auto it: store){
            int value = it % 2;
            it -= value;
            maxCon = max(maxCon, it / 2);
        }
        return maxCon == INT_MIN ? 1 : maxCon;
    }
};