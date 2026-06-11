class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len=s.length();
        
        //M-1 brutForce try all pairs  (30ms)  
        // for(int i=1;i<=len/2;i++){
        //     if(len%i!=0) continue;  //(string must be divided by len of sbstring)
        //     String sub=s.substring(0,i);
        //     StringBuilder sb=new StringBuilder();
        //     int times=len/i;
        //     for(int k=0;k<times;k++) sb.append(sub);
        //     if(sb.toString().equals(s)) return true;
        // }
        // return false;

        //M-2  (76ms)  
        /*(IDEA : if we double the string ans remove first ans last character then also s will be there)
            ans it happens only when a string is made by repeating substring  */
        // String doubled=s+s;
        // String trimmed=doubled.substring(1,doubled.length()-1);
        // return trimmed.contains(s);

        //M-3  (11ms) 
        for(int i=1;i<=len/2;i++){
            if(len%i!=0) continue;  //(string must be divided by len of sbstring)
            boolean ok=true;
            for(int j=i;j<len;j++){
                if(s.charAt(j)!=s.charAt(j%i)) {
                    ok=false;
                    break;
                }
            }
            if(ok) return true;
        }
        return false;
    }
}