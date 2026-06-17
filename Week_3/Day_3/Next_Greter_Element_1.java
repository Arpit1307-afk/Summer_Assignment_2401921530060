import java.util.*;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums2.length;
        int m=nums1.length;
       int[] nge=new int[n]; //it will contain next greater of nums 2 
       Stack<Integer> st=new Stack<>();
       nge[n-1]=-1;
       st.push(nums2[n-1]);
       for(int i=n-2;i>=0;i--)
       {
         while(st.size()!=0 && nums2[i]>=st.peek()) st.pop();
         if(st.size()==0) nge[i]=-1;
         else  nge[i]=st.peek();
         st.push(nums2[i]);
       }
       int[] ans=new int[m]; 
       String str=new String(nums2,0,n);
       for(int i=0;i<m;i++)
       {
         int ele=nums1[i];
        int idx=str.indexOf((char)ele);
        ans[i]=nge[idx];
       }
       return ans;
    }
}