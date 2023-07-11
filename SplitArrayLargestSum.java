public class SplitArrayLargestSum 
{
    public static void main(String args[])
    {

    }   
    static int splitArray(int[]nums,int m)
    {
        int start=0;
        int end=0;
        for(int i=0;i<nums.length;i++)
        {
            start=Math.max(start, nums[i]);//in the end of the loop this will contain the max item from the array
            end=end+nums[i];
        }
        //binary search
        while(start<end)
        {
            //try for the middle for the potential answer
            int mid=(start+end)/2;
            //calculate how many pieces you can divide this in with the max sum
            int sum=0;
            int pieces=1;
            for(int num:nums)
            {
                if(sum+num>mid)
                {
                    //you cannot add this in this subarray. Make new one
                    //say you add this num in the subarrray, then the sum==num.
                    sum=num;
                    pieces++;
                }
                else{
                    sum=sum+num;
                }
            }
            if(pieces>m)
            {
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return end;
    } 
}
