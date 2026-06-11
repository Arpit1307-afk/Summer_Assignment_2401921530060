import java.util.*;
class Solution {
    public static void Generate(int left,int right,int n,List<String> ans,String str)
    {
        if(right==n)  // str.length()==2*n
        {
            ans.add(str);
            return;
        }   
        if(left<n) Generate(left+1, right, n, ans, str+"(");
        if(right<left) Generate(left, right+1, n, ans, str+")");
        //two calls at a time depending on situation 
        //not one after another
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        Generate(0,0,n,ans,"");
        return ans;
    }
}