import java.util.*;
import java.lang.*;
public class Sumarraytriangle 
{
    public static void main(String args[])
    {
    //    int arr[]=new int[20];
    //    int n,i;
    //    Scanner sc=new Scanner(System.in);
    //    System.out.print("Enter the size of array: ");
    //    n=sc.nextInt();
    //    System.out.println("Enter the elements of the array: ");
    //    for(i=0;i<n;i++)
    //    {
    //       arr[i]=sc.nextInt();
    //    }
         int arr[]={2,4,3,1,5};
       //System.out.println("The array is: "+arr[i]);
       sumarray(arr);
    }
    static void sumarray(int[] arr)
    {
        if(arr.length<1)
        {
            return;
        }
        int sum[]=new int[arr.length-1];
        int x;
        for(int i=0;i<arr.length-1;i++)
        {
            x=arr[i]+arr[i+1];
            sum[i]=x;
        }
        sumarray(sum);
        System.out.println(Arrays.toString(arr));
    }
}
