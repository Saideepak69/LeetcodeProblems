class Solution {
    public int numberOfSpecialChars(String word) {
        Map<Character,Integer> mpp = new HashMap<>();
        for(char  ch: word.toCharArray()){
            mpp.put(ch, mpp.getOrDefault(ch,0)+1);
        }
        int cnt = 0;
        Map<Character,Integer> mpp2 = new HashMap<>();
        Set<Character> st = new HashSet<>();
        for(char ch: word.toCharArray()){
            boolean flag = true;
            char chDown = Character.toLowerCase(ch);
            if(ch != chDown && !st.contains(ch)){
                if(mpp.getOrDefault(chDown,0) > 0 &&
                    mpp.getOrDefault(chDown,0).equals(mpp2.getOrDefault(chDown,0))){
                        cnt++;
                }
            }
            mpp2.put(chDown, mpp2.getOrDefault(chDown,0)+1);
            st.add(ch);
        }
        return cnt;
    }
}