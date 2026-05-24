class MyQueue {
    ArrayDeque<Integer> dq;
    public MyQueue() {
        dq = new ArrayDeque<>();
    }
    
    public void push(int x) {
        dq.addLast(x);
    }
    
    public int pop() {
        return dq.removeFirst();
    }
    
    public int peek() {
        return dq.peekFirst();
    }
    
    public boolean empty() {
        return dq.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */