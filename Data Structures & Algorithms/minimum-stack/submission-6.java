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
      Stack <Integer> st= new Stack<>();
      int min = stack.peek();
      while(!stack.isEmpty())
      {
        min = Math.min(min, stack.peek());
        st.push(stack.pop());
      }
      while(!st.isEmpty()){
        stack.push(st.pop());
      }
      return min;
    }
}
