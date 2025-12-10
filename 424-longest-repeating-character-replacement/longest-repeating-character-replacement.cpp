class Solution {
public:
    int characterReplacement(string s, int k) {
        unordered_map<char,int> mpp;
        int maxLen = 0;
        int maxFreq = 0;
        int j = 0;
        for(int i=0; i<s.size(); i++){
            mpp[s[i]]++;
            maxFreq = max(maxFreq, mpp[s[i]]);
            while((i - j + 1) - maxFreq > k){
                mpp[s[j]]--;
                j++;
            }
            maxLen = max(maxLen, i-j+1);
        }
        return maxLen;
    }
};