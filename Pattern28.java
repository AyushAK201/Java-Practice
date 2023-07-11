import java.util.*;
import java.lang.*;
public class Pattern28
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        p28(n);
    }
    static void p28(int n)
    {
        for(int row=0;row<2*n+1;row++)
        {
            int totalcolsinrows=row>n?2*n-row:row;
            int numberofspaces=n-totalcolsinrows;
            for(int space=0;space<numberofspaces;space++)
            {
                System.out.print(" ");
            }
            for(int col=0;col<=totalcolsinrows;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}