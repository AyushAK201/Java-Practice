public class SetMismatch 
{
   public static void main(String[] args) 
   {
    
   }
   public int[] findErrorNums(int[] nums) 
   {
    int i=0;
    while(i<nums.length)
    {
        int correct_index=nums[i]-1;
       if(nums[i]<nums.length && nums[correct_index]!=nums[i])
       {
         swap(nums,i,correct_index);
       }
       else{
        i++;
       }
    }
    //search for the missing number
    for(int index=0;index<nums.length;index++)
    {
        if(nums[index]!=index+1)
        {
            return new int[]{nums[index],index+1};
        }

    }
    return new int[]{-1,-1};
   }
   static void swap(int[]arr,int first,int second)
   {
      int temp=arr[first];
      arr[first]=arr[second];
      arr[second]=temp;
   }       
}
