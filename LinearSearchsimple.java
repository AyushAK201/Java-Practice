public class LinearSearchsimple 
{
    public static void main(String args[])
    {
       int arr[]={1,8,6,2,5,4,8,3,7};
       int target=7;
       int ans=Search(arr, target);
       System.out.println(ans);
    }
    static int Search(int arr[],int target)
    {
        if(arr.length==0)
        {
            return -1;
        }
        for(int index=0;index<arr.length;index++)
        {
           //int element=arr[index];
           if(arr[index]==target)
           {
            return index;
           }
        }
        System.out.println("Element not found");
        return -1;
    }
} 
