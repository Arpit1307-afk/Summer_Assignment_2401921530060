import java.util.*;
class Solution {
    public static int top=-1;
    public boolean isValid(String s) {
      int n=s.length();
      if(n%2==1) return false;
      Stack<Character> st=new Stack<>();
      for(int i=0;i<n;i++)
      {
        char ch=s.charAt(i);
        if(ch=='(' || ch=='{' || ch=='[') st.push(ch);
        else{
            if(st.size()==0) return false;
            char top=st.peek();
            if(sameStyle(top,ch)) st.pop();
            else return false;
        }
      }
      return st.size()==0;
    }
    public static boolean sameStyle(char a,char b)
    {
        if(a=='(' && b==')') return true;
        else if(a=='{' && b=='}') return true;
        else if(a=='[' && b==']') return true;
        else return false;
    }
}