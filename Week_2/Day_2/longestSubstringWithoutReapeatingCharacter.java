class Solution {
    public int lengthOfLongestSubstring(String s) {
        //brutforce  (10ms)
        // String ans="";
        // int maxC=0;
        // int n=s.length();
        // for(int i=0;i<n;i++){
        //     char c=s.charAt(i);
        //     int idx=ans.indexOf(c);
        //     ans+=c;
        //     if(idx!=-1){
        //         ans=ans.substring(idx+1);
        //     }
        //     if(ans.length()>maxC) maxC=ans.length();
        // }
        // return maxC;

        //M-2 using just pointers(1ms)
        int[] last=new int[128]; //to store the index of last occurance of each element
        for(int i=0;i<128;i++) last[i]=-1;  //since no occutrance
        int left=0,maxL=0,n=s.length();
        for(int right=0;right<n;right++){ 
            char idx=s.charAt(right);
            if(last[idx]>=left){  //left tells the starting of current substring
            left=last[idx]+1;
            }
            last[idx]=right;
            maxL=Math.max(maxL,right-left+1);
        }
        return maxL;
    }
}