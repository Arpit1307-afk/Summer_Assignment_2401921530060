class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        // using 2 pointer   
        // int left = 0; 
        // for (int right = 0; right < nums.length; right++) {
        //     if (nums[right] != 0) {
        //         int temp = nums[right];
        //         nums[right] = nums[left];
        //         nums[left] = temp;
        //         left++;
        //     }
        // }
        // using 2 pointer M-2  
        int low = 0,high=n-1; 
        while(low<=high)
        {
            if(nums[low]!=0) low++;
            else if(nums[high]==0) high--;
            else{
                int temp=nums[low];
                nums[low]=nums[high];
                nums[high]=temp;
            }
        }
        // int snowball=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]==0) snowball++;
        //     else if(snowball>0)
        //     {
        //        int temp=nums[i];
        //        nums[i]=0;
        //        nums[i-snowball]=temp;
        //     }
        // }
    }
}