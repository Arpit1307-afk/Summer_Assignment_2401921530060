class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0,j=n-1;
        int maxA=0;
        while(i<=j)
        {
           int currA=(j-i)*Math.min(height[i],height[j]);
           if(currA>maxA) maxA=currA;
           if(height[i]>height[j])  j--;
           else i++;
        }
        return maxA;
    }
}
