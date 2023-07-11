public class RBS 
{
    public static void main(String args[])
    {
       int[] arr={5,6,7,8,9,1,2,3};
       int target=5;
       System.out.println(search(arr,target,0,arr.length-1));

    }    
    static int search(int[]arr,int target,int s,int e)
    {
        if(s>e)
        {
            return -1;
        }
        int middle=s+(e-s)/2;
        if(arr[middle]==target)
        {
            return middle;
        }
        if(arr[s]<=arr[middle])
        {
            if(target>=arr[s] && target<=arr[middle]) 
            {
               return search(arr,target,s,middle-1);
            }
            else
            {
               return search(arr,target,middle+1,e);
            }
        }
        if(target>=arr[middle] && target<=arr[e])
        {
            return search(arr,target,middle+1,e);
        }
        else
        {
            return search(arr,target,s,middle-1);
        }
    } 
}
