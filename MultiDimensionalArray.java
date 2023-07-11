import java.util.*;

public class MultiDimensionalArray 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        /*int[][] arr=new int[3][];->we have to specify the number of rows we can't skip it.
        we can specify the number of columns later*/
        int[][] arr2={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        }; 
        int[][]arr3=new int[3][3];
        //System.out.println(arr.length);//it will give me the number of rows that is 3 irrespective of the value of the columns
        for(int row=0;row<arr3.length;row++)
        {
            //for each column in every row i want to take the input
            for(int col=0;col<arr3[row].length;col++)
            {
                arr3[row][col]=in.nextInt();
            }
        }
        //output
        //Method 1.for(int row=0;row<arr3.length;row++)
        // {
        //     for(int col=0;col<arr3[row].length;col++)
        //     {
        //         System.out.print(arr3[row][col] + " ");
        //     }
        //     System.out.println();
        // }
        //Method 2 for(int row=0;row<arr3.length;row++)
        // {
        //     System.out.println(Arrays.toString(arr3[row]));
        // }
        for(int[]a:arr3)
        {
            System.out.println(Arrays.toString(arr3));
        }
    }    
}
