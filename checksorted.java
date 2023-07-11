public class checksorted 
{
    public static void main(String args[])
    {
       int arr[]={1,2,3,5,16,8};
       System.out.println(sortedornot(arr, 0));
    }
    static boolean sortedornot(int[]arr,int index)
    {
        //base condition
        if(index==arr.length-1)
        {
            return true;
        }
        return arr[index]<arr[index+1] && sortedornot(arr,index+1);
    }
}
