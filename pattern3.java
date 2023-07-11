import java.util.*;
import java.lang.*;
public class pattern3 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        p3(n);
    }   
    static void p3(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=n-row+1;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    } 
}
