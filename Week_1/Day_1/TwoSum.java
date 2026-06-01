import java.util.HashMap;

public class TwoSum {
     public int[] twoSum(int[] nums, int target) {
        
        // for(int i=0;i<nums.length;i++)
        // {
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //         if(nums[i]+nums[j]==target)
        //         {
        //             int[] sol=new int[2];
        //             sol[0]=i;
        //             sol[1]=j;
        //             return sol;
        //         }
        //     }
        // } 
        // return new int[0];       

        //M-2 using HashMap
        HashMap<Integer,Integer> map=new HashMap<>();  //element,index
        for(int i=0;i<nums.length;i++)
        {
            int r=target-nums[i];
            if(map.containsKey(r))
            {
                int[] sol={map.get(r),i};
                return sol;  
            }
            else{
                map.put(nums[i],i);
            }
        } 
        return new int[0]; 
    }
}
