class Solution {
    public List<String> removeInvalidParentheses(String s) {
        Queue<String> q = new LinkedList<>();
        Set<String> ans = new HashSet<>();
        q.offer(s);
        Set<String> st = new HashSet<>();
        boolean found = false;
        while(!q.isEmpty()){
            String curr = q.poll();
            if(isValid(curr)){
                ans.add(curr);
                found = true;
            }
            if(found) continue;
            for(int i=0; i<curr.length(); i++){
                char ch = curr.charAt(i);
                if(ch != '(' && ch != ')') continue;
                String next = curr.substring(0, i) + curr.substring(i+1);
                if(!st.contains(next)){
                    st.add(next);
                    q.offer(next);
                }
            }
        }
        List<String> res = new ArrayList<>(ans);
        return res;
    }
    public boolean isValid(String s){
        int count = 0;
        for(char ch: s.toCharArray()){
            if(ch == '('){
                count++;
            }
            else if(ch == ')'){
                if(count == 0) return false;
                count--;
            }
        }
        return count == 0;
    }
}