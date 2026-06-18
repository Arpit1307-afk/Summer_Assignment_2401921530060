import java.util.*;
class Solution {
    public int[] nextSmall(int[] arr)
    {
        int n=arr.length;
        int[] ans=new int[n];
        ans[n-1]=n;
        Stack<Integer> st=new Stack<>();
        st.push(n-1);
        for(int i=n-2;i>=0;i--)
        {
            while(st.size()!=0 && arr[i]<=arr[st.peek()]) st.pop();
            if(st.size()==0) ans[i]=n;
            else ans[i]=st.peek();
            st.push(i);
        }
        return ans;
    }
    public int[] prevSmall(int[] arr)
    {
        int n=arr.length;
        int[] ans=new int[n];
        ans[0]=-1;
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for(int i=1;i<n;i++)
        {
            while(st.size()!=0 && arr[i]<=arr[st.peek()]) st.pop();
            if(st.size()==0) ans[i]=-1;
            else ans[i]=st.peek();
            st.push(i);
        }
        return ans;
    }
    public int largestRectangleArea(int[] heights) {
        int[] psmall=prevSmall(heights);
        int[] nsmall=nextSmall(heights);
        int maxAr=0;
        for(int i=0;i<heights.length;i++)
        {
           int ar=heights[i]*(nsmall[i]-psmall[i]-1);
           if(ar>maxAr) maxAr=ar;
        }
        return maxAr;
    }
}