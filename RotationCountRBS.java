public class RotationCountRBS 
{
    public static void main(String args[])
    {
        int[]arr={4,5,6,7,0,1,2};
        System.out.println(countRotations(arr));
    }    
    static int countRotations(int[]arr)
    {
        int pivot=findpivot(arr);
        return pivot+1;
    }
    static int findpivot(int[]arr)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            //4 cases over here
            if(mid<end && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1])
            {
                return mid-1;
            }
            if(arr[mid]<=arr[start])
            {
                end=mid-1; 
            }
            else            
            { 
                start=mid+1;
            }
        }
        return -1;
    }
    static int findpivotwithduplicates(int[]arr)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            //4 cases over here
            if(mid<end && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1])
            {
                return mid-1;
            }
            //if elements at middle,start,end are equal just skip the duplicates
            if(arr[mid]==arr[start]&&arr[mid]==arr[end])
            {
                //skip the duplicates
                //NOTE:what if these elements at start and end were the pivot?
                //check if start is pivot
                if(arr[start]>arr[start+1])
                {
                    return start;
                }
                start++;
                //check weather end is pivot or not
                if(arr[end]<arr[end-1])
                {
                    return end-1;
                }
                end--;
            }
            //left side is sorted,so pivot should be in right
             else if(arr[start]<arr[mid] || arr[start]==arr[mid] && arr[mid]>arr[end])
             {
                  start=mid+1;
             }
             else
             {
             end=mid-1;
             }

        }
        return -1;
    }
    // static int BS(int[]nums,int target,int start,int end)
    // {
    //     while(start<=end)
    //     {
    //         int mid=(start+end)/2;
    //         if(target<nums[mid])
    //         {
    //             end=mid-1;
    //         }
    //         if(target>nums[mid])
    //         {
    //             start=mid+1;
    //         }
    //         if(target==nums[mid])
    //         {
    //             return mid;
    //         }
    //     }
    //     return -1;
    // }
}
