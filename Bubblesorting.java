import java.util.Arrays;

public class Bubblesorting 
{
    public static void main(String arsg[])
    {
       int[]arr={3,1,5,4,2};
       bubblesort(arr);
       System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int[]arr)
    {
        boolean swap=false;
        //run the steps n-1 times
        for(int i=0;i<arr.length;i++)
        {
            //for each step, max item will come at the last respective index
            for(int j=1;j<arr.length-i;j++)
            {
                //swap if the item is smaller than the previous item
                if(arr[j]<arr[j-1])
                {
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }

            }
            //if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if(!swap)
            {
                break;
            }
        }
    }
}
