public class Searchinmountainarray 
{
    public static void main(String args[])
    {

    }   
    static int searchmountain(int[]arr,int target)
    {
        int peak=peakmountainarray(arr);
        int firstTry=search(arr,target,0,peak);
        if(firstTry!=-1)
        {
            return firstTry;
        }
        return search(arr,target,peak+1,arr.length-1);
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
            end=mid;
        }
        if(arr[mid]<arr[mid])
        {
            start=mid+1;
        }
    } 
    return start;
   }
   static int search(int[]arr,int target,int start,int end)
   {
    int s=0;
    int e=arr.length-1;
    //Find whether the array is sorted in ascending or descending order
    //boolean isAsc=arr[s]<arr[e]
    boolean isAsc;
    if(arr[s]<arr[e])
    {
      isAsc=true;
    }else{
    isAsc=false;
    }
    while(s<=e)
    {
      int mid=(s+e)/2;
      if(arr[mid]==target)
      {
          return mid;
      }
      if(isAsc==true)
      {
      if(target<arr[mid])
      {
          e=mid-1;
      }
      else
      {
          s=mid+1;
      }
      }
      else
      {
      if(target>arr[mid])
      {
          e=mid-1;
      }
      else
      {
          s=mid+1;
      }
      }
    }
    return -1;
}
} 
