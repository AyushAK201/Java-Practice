import java.util.Arrays;

public class Twosum 
{
   public static void main(String[] args) 
   {
       int[]nums={3,2,4};
       int target=6;
       Arrays.toString(nums);
       System.out.print(Arrays.toString(twoSum(nums,target)));
   }
   static int[] twoSum(int[] nums, int target)
   {
     int i=0,sum=0;
     int j=nums.length-1;
     while(i<j)
     {
        sum=nums[i]+nums[j];
        if(sum==target)
        {
            return new int[]{i,j};
        }
        if(sum>target)
        {
            j--;
        }
        else{
            i++;
        }
     }
    return new int[]{-1,-1};    
}
}
