import java.util.*;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        // brutforce (708ms)
        int n=s.length();
        int m=p.length();
        var ans=new ArrayList<Integer>();
        if(m>n) return ans;
        Map<Character,Integer> pMap=new HashMap<>();
        for(char c:p.toCharArray()) pMap.put(c,pMap.getOrDefault(c,0)+1);
        int left=0,count=m;
        for(int right=0;right<n;right++){
            char ch=s.charAt(right);
            int val=pMap.getOrDefault(ch,0);
            if(val>0) count--;
            pMap.put(ch,val-1);
            if(right-left+1>m){
                char leftChar=s.charAt(left);
                int leftVal=pMap.getOrDefault(leftChar,0);
                if(leftVal>=0) count++;  //as that character was required
                pMap.put(leftChar,leftVal+1);
                left++;
            }
            if(count==0) ans.add(left);
        }
        return ans;
        }
    }
