class Solution {
public:
    bool hasIncreasingSubarrays(vector<int>& nums, int k) {
        int cnt=1;
        set<int> st;
        if(k == 1) return true;
        for(int i=0; i<nums.size()-1; i++){
            if(nums[i] < nums[i+1]) cnt++;
            else cnt=1;
            if(cnt - k >= 0) st.insert(i+1);
        }
        for(auto it: st){
            if(st.find(it - k) != st.end()){
                return true;
            }
        }
        return false;
    }
};