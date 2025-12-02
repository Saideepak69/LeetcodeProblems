class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        for (String s : tokens) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int b = stk.pop();
                int a = stk.pop();
                int res = 0;

                switch (s) {
                    case "+": res = a + b; break;
                    case "-": res = a - b; break;
                    case "*": res = a * b; break;
                    case "/": res = a / b; break; 
                }

                stk.push(res);
            } 
            else {
                stk.push(Integer.parseInt(s));
            }
        }

        return stk.pop();
    }
}