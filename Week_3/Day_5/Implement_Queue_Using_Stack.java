import java.util.*;
class MyQueue {
    Stack<Integer> st;
    Stack<Integer> helper;
    public MyQueue() {
        st=new Stack<>();
        helper=new Stack<>();
    }
    //Push efficient method i.e push operation at O(1) time
    // public void push(int x) { ///O(1)
    //     st.push(x);
    // }
    
    // public int pop() { //O(n) time
    //     //remove bottom of st;
        // while(st.size()>1) helper.push(st.pop());
        // int n=st.pop();
        // while(helper.size()!=0) st.push(helper.pop());
    //     return n;
    // }
    
    // public int peek() {  //O(n) time
    //     //return bottom of st;
    //     while(st.size()>1) helper.push(st.pop());
    //     int n=st.peek();
    //     while(helper.size()!=0) st.push(helper.pop());
    //     return n;
    // }
    
    // public boolean empty() {
    //     return (st.size()==0);
    // }

    //POP and PEEK efficient
    public void push(int x) { //push at bottom always O(n) time
        while(st.size()>0) helper.push(st.pop());
        st.push(x);
        while(helper.size()!=0) st.push(helper.pop());
    }
    
    public int pop() { //O(1) time
        return st.pop();
    }
    
    public int peek() {  //O(1) time
        return st.peek();
    }
    
    public boolean empty() {
        return (st.size()==0);
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