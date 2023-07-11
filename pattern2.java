import java.util.*;
import java.lang.*;
public class pattern2 
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         p1(n);
    }
    static void p1(int n)
    {
        for(int row=1;row<=n;row++)
        {
           //for every row run the column
           for(int col=1;col<=row;col++)
           {
               System.out.print("* ");
           }
           //when one row is printed we need to add a new line
            System.out.println();
        }
    }
}
