import java.util.*;
import java.lang.*;
public class pattern4 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        p4(n);
    }
    static void p4(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=row;col++)
            {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
