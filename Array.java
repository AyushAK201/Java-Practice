public class Array 
{
    public static void main(String args[])
    {
        int[] ros;//declaration of array.ros is getting defined in the stack
        ros=new int[5];//initialization:actually here object is being created in the memory(heap).
        for(int num:ros)//for every element in the array,print the element
        {
            System.out.print(num + " ");//here num represents the element of the array
        }
    }    
}
