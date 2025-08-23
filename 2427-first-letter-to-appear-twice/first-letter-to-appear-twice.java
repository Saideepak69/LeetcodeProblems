class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> st=new HashSet<>();
        char final_ch= '9';
        for(char ch: s.toCharArray()){
            if(st.contains(ch)){
                final_ch=ch;
                break;
            }
            st.add(ch);
        }
        return final_ch;
    }
}