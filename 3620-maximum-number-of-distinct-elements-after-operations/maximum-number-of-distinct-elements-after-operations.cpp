class Solution {
public:
    int maxDistinctElements(vector<int>& nums, int k) {
        sort(nums.begin(), nums.end());
        int prevMax = INT_MIN, cnt = 0;
        int n=nums.size();
        for(int i=0; i<n; i++){
            int lowerBound = nums[i]-k;
            int upperBound = nums[i]+k;
            if(prevMax < lowerBound){
                prevMax = lowerBound;
                cnt++;
            }
            else if(prevMax < upperBound){
                prevMax++;
                cnt++;
            }
        }
        return cnt;
    }
};