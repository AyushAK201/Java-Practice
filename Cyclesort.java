import java.util.Arrays;

public class Cyclesort 
{
   public static void main(String args[])
   {
      int[]arr={3,5,2,1,4};
      cyclicsort(arr);
      System.out.println(Arrays.toString(arr));
   }
   static void cyclicsort(int[]arr)
   {
    int i=0;
    while(i<arr.length)
    {
       int correct_index=arr[i]-1;
       if(arr[correct_index]!=arr[i])
       {
         swap(arr,i,correct_index);
       }
       else{
        i++;
       }
    }
   }
   static void swap(int[]arr,int first,int second)
   {
      int temp=arr[first];
      arr[first]=arr[second];
      arr[second]=temp;
   }    
}
