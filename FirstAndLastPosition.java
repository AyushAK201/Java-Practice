public class FirstAndLastPosition 
{
   public static void main(String args[])
   {

   }
   static int[] searchrange(int[]nums,int target)
   {
    int[] ans={-1,-1};
    //check for the first occurance of the target first
    int start=search(nums, target, true);
    int end=search(nums, target, false);
    ans[0]=start;
    ans[1]=end;
    return ans;
   }
   //this fucntion returns the index value of the target
   static int search(int[]nums,int target,boolean find_start_index)
   {
    int ans=-1;
    int start=0;
    int end=nums.length-1;
    while(start<=end)
    {
        int mid=(start+end)/2;
        if(target<nums[mid])
        {
            end=mid-1;
        }
        if(target>nums[mid])
        {
            start=mid+1;
        }
        if(target==nums[mid])
        {
            ans=mid;//potential answer is found
            if(find_start_index==true)
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
    }
    return ans;
   }    
}
