public class OrderAgnosticBS 
{
    public static void main(String args[])
    {
       int[]arr={-18,-12,-4,0,2,3,4,15,16,18,22,45};
       int target=18;
       System.out.println(orderAgnostic(arr, target));
       int[]arr2={99,80,75,22,11,10,5,2,-3};
       int target2=22;
       System.out.println(orderAgnostic(arr2, target2));
    }   
    static int orderAgnostic(int[]arr,int target)
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

