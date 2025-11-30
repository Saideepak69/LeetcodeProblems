class Solution {
    public int minimumLength(String s) {
        Map<Character,Integer> mpp = new HashMap<>();
        int tot = 0;
        for(char ch: s.toCharArray()){
            mpp.put(ch, mpp.getOrDefault(ch,0)+1);
            if(mpp.get(ch) >= 3){
                int freq = mpp.get(ch);
                freq-=2;
                mpp.put(ch, freq);
                tot += 2;
            }
        }
        return s.length() - tot;
    }
}