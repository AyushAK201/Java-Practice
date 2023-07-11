public class FindDuplicateNumber 
{
   public static void main(String args[])
   {

   }
   public int findDuplicate(int[]nums)
   {
    int i=0;
    while(i<nums.length)
    {
        if(nums[i]!=i+1)
        {
            int correct_index=nums[i]-1;
            if(nums[correct_index]!=nums[i])
            {
              swap(nums,i,correct_index);
            }
            else{
                return nums[i];
            }
        }
        else
        {
            i++;
        }
       }
       return -1;
    }
   static void swap(int[]arr,int first,int second)
   {
      int temp=arr[first];
      arr[first]=arr[second];
      arr[second]=temp;
   }       
}
