import java.util.*;
import java.lang.*;
import java.math.*;
public class maxminarray 
{
    public static void main(String args[])
    {
        int arr[]={1, 4, 45, 6, -50, 10, 2};
        int n=arr.length;
        System.out.println(n);
        System.out.println(minimum(arr, n));
        System.out.println(maximum(arr, n));
    }
   static int minimum(int arr[],int n)
   {
   int min=0;
    if(n==1)
    {
        return arr[0];
    }
    for(int i=0;i<n-1;i++)
    {
        if(arr[i]<min)
        {
            min=arr[i];
        }   
    }
    minimum(arr, n-1);
    return min;
}
    //return Math.min(arr[n-1],max_min(arr,n-1));
    static int maximum(int arr[],int n)
    {
         int max=0;
        if(n==1)
        {
            return arr[0]; 
        }
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        maximum(arr,n-1);
        return max;
        //return Math.max(arr[n-1],maximum(arr,n-1));
    }
}
