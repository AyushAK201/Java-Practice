public class Ceiling 
{
   public static void main(String args[])
   {
      int[]arr={2,3,5,9,14,16,18};
      int target=15;
      System.out.println(cealingvalue(arr, target));
   }
   static int cealingvalue(int[]arr,int target)//smallest number greater than equal to target i.e greater number<=target
   {
    int start=0;
    int end=arr.length-1;
    while(start<=end)
    {
        int mid=(start+end)/2;
        if(target<arr[mid])
        {
            end=mid-1;
        }
        if(target>arr[mid])
        {
            start=mid+1;
        }
        if(target==arr[mid])
        {
            return mid;
        }
    }
    return start;
   }    
}
