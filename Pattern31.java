import java.util.*;
import java.lang.*;
public class Pattern31
{
    public static void main(String args[])
    { 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        p31(n);
    }
    static void p31(int n)
    {
        int originalN=n;
        n=2*n;
        for(int row=0;row<=n;row++)
        {
            for(int col=0;col<=n;col++)
            {
                int ateveryindex=originalN-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(ateveryindex + " ");
            }
            System.out.println();
        }
    }
}
