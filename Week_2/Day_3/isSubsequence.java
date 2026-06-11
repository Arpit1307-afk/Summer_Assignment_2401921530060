class Solution {
    public boolean isSubsequence(String s, String t) { // search s in t
        //using 2 pointer
        int sp=0,tp=0;
        while(sp<s.length() && tp<t.length())
        {
            if(s.charAt(sp)==t.charAt(tp))  sp++;
            tp++;
        }
        return sp==s.length();
    }
}