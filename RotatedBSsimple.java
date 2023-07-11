public class RotatedBSsimple 
{
    public static void main(String args[])
    {
        int[]arr={4,5,6,7,0,1,2};
        System.out.println(findpivot(arr));
    }
    static int search(int[]nums,int target,int start,int end)
    {
        int pivot=findpivot(nums);
        //if you did not find a pivot it means the array is not rotated
        if(pivot==-1)
        {
            //just do normal binary search
            return BS(nums, target, 0, nums.length-1);
        }
        //if pivot if found we have find 2 ascending arrays
        if(nums[pivot]==target)
        {
            return pivot;
        }
        if(target>=nums[0])
        {
            return BS(nums, target, 0, pivot-1);
        }
        return BS(nums,target,pivot+1,nums.length-1);
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
    static int BS(int[]nums,int target,int start,int end)
    {
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
                return mid;
            }
        }
        return -1;
    }
}
