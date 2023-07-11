public class peakindexmountainarray 
{
   public static void main(String args[])
   {

   }
   static int peakmountainarray(int[]arr)
   {
    int start=0;
    int end=arr.length-1;
    while(start<end)
    {
        int mid=(start+end)/2;
        if(arr[mid]>arr[mid+1])
        {
            //you are in the decreasing part of array
            //this may be the answer but look at the left
            //this is why end !=mid-1;
            end=mid;
        }
        if(arr[mid]<arr[mid])
        {
            //you are in the increasing part of array
            start=mid+1;//because we know that mid+1 element is greater than mid element
        }
        //in the end the start==end pointing to the largest element because of the above 2 checks
        //start and end are always trying to find max element in the above 2 checks
        //hence,when they are pointing to just one element, that is the max one because that is what the checks say
        //more elaboration:at every point of time for start and end, they have the best possible answer till that time.
        //and if we are saying that only one item is remaining,hence cuz of above line that is the best possible answer.
    } 
    return start;//return start or end as both are equal at the end;
   }    
}
