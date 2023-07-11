import java.util.*;
import java.lang.*;
public class Fibo
{
    public static void main(String args[])
    {
        int i;
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
        System.out.print(" "+ Fibonachi(i));
        }
    }
    static int Fibonachi(int n)
    {
        if(n<2)
        {
            return n;
        }
        return Fibonachi(n-1)+Fibonachi(n-2);
    }
}