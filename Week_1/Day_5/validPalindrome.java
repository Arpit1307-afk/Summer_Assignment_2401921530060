class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        // String ans="";
        // for(int i=0;i<n;i++){
        //     int a=(int)s.charAt(i);
        //     if((a>=65 && a<=90) || (a>=97 && a<=122) || (a>=48 && a<=57) ) ans+=s.charAt(i);
        // }
        // String ans1=ans.toLowerCase();
        // int m=ans1.length();
        // int l=0,h=m-1;
        // while(l<=h){
        //     if(ans1.charAt(l)!=ans1.charAt(h)) return false;
        //     l++;
        //     h--;
        // }
        // return true;
        int l=0,h=n-1;
        while(l<h){
            while(l<h && !Character.isLetterOrDigit(s.charAt(l))) l++;
            while(l<h && !Character.isLetterOrDigit(s.charAt(h))) h--;
            char left=Character.toLowerCase(s.charAt(l));
            char right=Character.toLowerCase(s.charAt(h));
            if(left!=right) return false;
            l++;
            h--;
        }
        return true;
    }
}