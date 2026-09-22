class MinStack {
    Stack<Long> st;
    long min=0;
    public MinStack() {
        st=new Stack<>();
    }
    
    public void push(int val) {
        long v=val;
        if(st.isEmpty()){
            min=v;
            st.push(min);
        }else if(val<min){
            st.push(2*v-min);
            min=v;
        }
        else{
            st.push(v);
        }
    }
    
    public void pop() {
        if(st.isEmpty())return ;
        long x=st.pop();
        if(x<min){
            min=2*min-x;
        }
    }
    
    public int top() {
        if(st.isEmpty())return -1;
        long x=st.peek();
        if(x<min){
            return (int)min;
        }
        else{
            return (int)x;
        }
    }
    
    public int getMin() {
        return (int)min;
    }
}
