public class SmallestLetter 
{
    public static void main(String args[])
    {

    }
    static char nextGreatestInteger(char[]arr,char target)
    {
        int start=0;
    int end=arr.length-1;
    while(start<=end)
    {
        int mid=(start+end)/2;
        if(target<arr[mid])
        {
            end=mid-1;
        }
        if(target>arr[mid])
        {
            start=mid+1;
        }
    }
    return arr[start%arr.length];
    }    
}
