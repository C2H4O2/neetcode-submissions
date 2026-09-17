class MinStack {
    private Stack<Integer> st;
    private Stack<Integer> minSt;

    public MinStack() {
        st = new Stack<>();
        minSt = new Stack<>();
    }

    public void push(int val) {
        st.push(val);
        if (minSt.isEmpty()) {
            minSt.push(val);
        }
        else if(minSt.peek() >= val){
            minSt.push(val);
        }
        
        
    }

    public void pop() {
        
        try {
            System.out.println(st.peek());
            
            int n = st.pop();
      
            if (minSt.peek() == n) {
                minSt.pop();
            }
        } catch (Exception e) {
            System.out.println("something went wrong");
            return;
        }
        
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        if(minSt.isEmpty()) {
            return 0;
        }
        return minSt.peek();
    }
}
