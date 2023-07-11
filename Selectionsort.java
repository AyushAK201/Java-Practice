import java.util.Arrays;

public class Selectionsort 
{
    public static void main(String args[])
    {
        int[]arr={4,5,1,2,3};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            //find the maximum item in the remaining array and swap it with the correct index
            int last=arr.length-i-1;
            int max_index=getmaxindex(arr,0,last);
            swaparray(arr,max_index,last);
        }
    }
    static int getmaxindex(int[]arr,int start,int end)
    {
        int max=start;
        for(int i=start;i<=end;i++)
        {
            if(arr[max]<arr[i])
            {
                max=i;
            }
        }
        return max;
    }
    static void swaparray(int[]arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }    
}