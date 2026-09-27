class MinStack {
    Stack <Integer> stack;
    Stack <Integer> minstack;

    public MinStack() {
        stack = new Stack();
        minstack = new Stack();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minstack.isEmpty() || minstack.peek()>=val)
        minstack.push(val);
    }
    
    public void pop() {
        if(stack.isEmpty()) return;
        int top = stack.pop();
        if(top==minstack.peek())
            minstack.pop();    
        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        if (minstack.isEmpty()== false)
        return minstack.peek();
        return -1;
    }
}
