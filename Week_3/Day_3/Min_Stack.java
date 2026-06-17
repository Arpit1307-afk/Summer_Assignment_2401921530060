import java.util.*;
class MinStack {  //we have to do all functions in O(1) time complexity
    Stack<Long> st=new Stack<>();
    long min=Long.MAX_VALUE;
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(st.size()==0)
        {
            st.push((long)val);
            min=(long)val;
        } 
        else if((long)val<min)
        {
            st.push((long)val+((long)val-min));
            min=(long)val;
        }
        else{
            st.push((long)val);
        }
    }
    
    public void pop() {
        if(st.peek()<min) 
        {
            min=min+(min-st.peek());
        }
        st.pop();
    }
    
    public int top() {
        long a=st.peek();
        if(a<min)
        {
            return (int)min;
        }
        else return (int)a;
    }
    
    public int getMin() {
        return (int)(min);
    }
}