import java.util.Arrays;

public class Insertionsort 
{
    public static void main(String args[])
    {
       int[]arr={0,-23,56,18};
       insertionsorting(arr);
       System.out.println(Arrays.toString(arr));
    } 
static void insertionsorting(int[]arr)
{
    for(int i=0;i<arr.length-1;i++)
    {
       for(int j=i+1;j>0;j--)
       {
        if(arr[j]<arr[j-1])
        {
            swaparray(arr, j,j-1);
        }
        else{
            break;
        }
       }
    }
}
static void swaparray(int[]arr,int first,int second)
{
    int temp=arr[first];
    arr[first]=arr[second];
    arr[second]=temp;
}        
}

