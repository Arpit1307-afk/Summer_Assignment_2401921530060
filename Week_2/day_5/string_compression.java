class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        //int i=0,idx=0;
        // while(i<n)
        // {
        //    char currCh=chars[i];
        //    int count=0;
        //    while(i<n &&chars[i]==currCh) 
        //    {
        //     i++;
        //     count++;
        //    } 
        //    chars[idx++]=currCh;
        //    if(count>1)
        //    {
        //     String num=Integer.toString(count);
        //     for(char ch:num.toCharArray())
        //     {
        //         chars[idx++]=ch;
        //     }
        //    }
        // }
        // return idx;

        // M-2
        int lo=0,hi=0,idx=0;
        while(hi<n)
        {
            int count=0;
            if(chars[lo]==chars[hi])  hi++;
            else
            {
                count=hi-lo;
                chars[idx++]=chars[lo];
                lo=hi;
            }
           if(count>1)
           {
            String num=Integer.toString(count);
            for(char ch:num.toCharArray())
            {
                chars[idx++]=ch;
            }
           }
        }
        int count=hi-lo;
        chars[idx++]=chars[lo];
        if(count>1)
        {
            String num=Integer.toString(count);
            for(char ch:num.toCharArray())
            {
                chars[idx++]=ch;
            }
        }
        return idx;
    }
}