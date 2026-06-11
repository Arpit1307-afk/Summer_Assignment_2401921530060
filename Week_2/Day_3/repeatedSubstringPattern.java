class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len=s.length();
        
        //M-1 brutForce try all pairs  (30ms)  
        for(int i=1;i<=len/2;i++){
            if(len%i!=0) continue;  //(string must be divided by len of sbstring)
            String sub=s.substring(0,i);
            StringBuilder sb=new StringBuilder();
            int times=len/i;
            for(int k=0;k<times;k++) sb.append(sub);
            if(sb.toString().equals(s)) return true;
        }
        return false;
    }
}