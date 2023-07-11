public class Floor 
{
   public static void main(String args[])
   {
    int[]arr={2,3,5,9,14,16,18};
    int target=15;
    System.out.println(floorvalue(arr, target));
   }
   static int floorvalue(int[]arr,int target)//greatest number smaller than equal to target i.e smaller number >=target
   {
    int start=0;
    int end=arr.length-1;
    //but what if the target number is greater than the largest number in the array
    if(target>arr[arr.length-1])
    {
        return -1;
    }
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
    return end;
   }    
}
