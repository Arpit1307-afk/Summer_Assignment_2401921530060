import java.util.*;
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        Deque<Integer> dq=new ArrayDeque<>();  //store indices
        for(int i=0;i<k;i++){   //to store max of first window
            if(dq.isEmpty()) dq.add(i);
            else{
                while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]) dq.pollLast();
                dq.add(i);
            }
        }
        int[] ans=new int[n-k+1]; //since (n-k+1) windows will be there
        ans[0]=nums[dq.peekFirst()];
        int m=1;
        for(int i=1;i<=n-k;i++){
            if(dq.isEmpty()) dq.add(i);
            else{
                while(!dq.isEmpty() && dq.peekFirst()<i) dq.pollFirst();
                while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i+k-1]) dq.pollLast();
                dq.add(i+k-1);
            }
            ans[m++]=nums[dq.peekFirst()];
        }
        return ans;
    }
}