class Solution {
    public int maxSubArray(int[] arr) {
        // int n=arr.length;
        // if(n==1) return arr[0];
        int maxS=Integer.MIN_VALUE;
        //M-1 brutforce  gives TLE
    //   for(int st=0;st<n;st++){
    //         for(int en=st;en<n;en++){
    //             int sum=0;
    //             for(int i=st;i<=en;i++){
    //                 sum+=arr[i];
    //             }
    //             if(sum>maxS) maxS=sum;
    //         }
    //     }

        // M-2  TLE
        // for(int st=0;st<n;st++){
        // int sum=0;
        //     for(int en=st;en<n;en++){
        //         sum+=arr[en];
        //         maxS=Math.max(maxS,sum);
        //     }
        // }

        //M-3 Kadane's Algo
        int currS=0;
        // for(int i=0;i<n;i++)
        // {
        //     currS+=arr[i];
        //     maxS=Math.max(maxS,currS);
        //     if(currS<0) currS=0;
        // }
        for(int i=0;i<arr.length;i++)
        {
            currS+=arr[i];
            maxS = currS>maxS?currS:maxS;
            currS=currS<=0?0:currS;
        }
        return maxS;
    }
}