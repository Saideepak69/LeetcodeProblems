class MyQueue {

    public Stack<Integer> stk;

    public MyQueue() {
        stk = new Stack<>();
    }

    public Stack<Integer> helper(Stack<Integer> stk){
        Stack<Integer> fake = new Stack<>();

        while(!stk.isEmpty()){
            fake.push(stk.pop());
        }

        return fake;
    }

    public void push(int x) {
        stk.push(x);
    }

    public int pop() {

        Stack<Integer> fake = helper(stk);

        int ans = fake.pop();

        stk = helper(fake);

        return ans;
    }

    public int peek() {

        Stack<Integer> fake = helper(stk);

        int ans = fake.peek();

        stk = helper(fake);

        return ans;
    }

    public boolean empty() {
        return stk.isEmpty();
    }
}