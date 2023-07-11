public class Missing_Number 
{
   public static void main(String[]args)
   {
      int[]arr={3,0,1};
      System.out.println(Missingnumber(arr));
   }
   
   public static int Missingnumber(int[]arr)
   {
    int i=0;
    while(i<arr.length)
    {
        int correct_index=arr[i];
       if(arr[i]<arr.length && arr[correct_index]!=arr[i])
       {
         swap(arr,i,correct_index);
       }
       else{
        i++;
       }
    }
    //search for the missing number
    for(int index=0;index<arr.length;index++)
    {
        if(arr[index]!=index)
        {
            return index;
        }

    }
    return arr.length;
   }
    static void swap(int[]arr,int first,int second)
   {
      int temp=arr[first];
      arr[first]=arr[second];
      arr[second]=temp;
   }  
}
