class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        Stack<Character> stk = new Stack<>();
        for(int i=0; i<n; i++){
            if(!stk.isEmpty() && stk.peek() == '(' && s.charAt(i) == ')'){
                stk.pop();
            }
            else{
                stk.add(s.charAt(i));
            }
        }
        return stk.size();
    }
}