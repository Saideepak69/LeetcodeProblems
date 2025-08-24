class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> myMap;
        int n=nums.size();
        for(int i=0; i<n; i++){
            if(myMap.contains(target - nums[i])){
                return {i, myMap[target - nums[i]]};
            }
            myMap[nums[i]]=i;
        }
        return {-1, -1};
    }
};