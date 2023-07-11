import java.util.*;
import java.lang.*;
public class pattern1
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
            for(int col=1;col<=n;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}