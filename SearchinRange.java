public class SearchinRange 
{
     public static void main(String args[])
     {
        int[]num={18,12,-7,3,14,28};
        int target=3;
        int low=1;
        int high=4;
        System.out.println(RangeSearch(low, high, num, target));
     }
     static int RangeSearch(int start,int end,int[]arr,int target)
     {
        if(arr.length==0)
        {
            return -1;
        }
        for(int index=start;index<=end;index++)
        {
            if(arr[index]==target);
            {
                return index;
            }
        }
        return -1;
     }    
}
