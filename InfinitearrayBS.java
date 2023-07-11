public class InfinitearrayBS 
{
   public static void main(String args[])
   {
      int[]arr={3,5,7,9,10,90,100,130,140,160,170};
      int target=10;
      System.out.println(findingRange(arr, target));
   }
   static int findingRange(int[]arr,int target)
   {
      //first find the range
       //start with the box of size 2
       int start=0;
       int end=1;
       //condition for the target to lie in the range
       while(target>arr[end])
       {
        int newstart=end+1;
        //double the box value
        //end=previous end+sizeofbox*2;
        end=end+((end-start+1)*2);
        start=newstart;
       }
       return infiniteBS(arr, target, start, end);
   }
   static int infiniteBS(int[]arr,int target,int start,int end)
   {
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
    return -1;
   }    
}
