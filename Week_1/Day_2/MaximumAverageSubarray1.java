class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length,sum=0;
        int maxSum=Integer.MIN_VALUE,j=0;
        for(int i=0;i<n;i++){
            if(i<k) sum+=nums[i];
            else{
                maxSum=Math.max(maxSum,sum);
                sum+=nums[i]-nums[j++];
            }
        }
        maxSum=Math.max(maxSum,sum);  //to check the last window or if only one elemenyt is there
        double ans=(double) maxSum;
        return (double)(ans/k);
    }
}