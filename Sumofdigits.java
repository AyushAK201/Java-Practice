import java.util.*;
import java.lang.*;
public class Sumofdigits 
{
    public static void main(String args[])
    {
       int n;
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a number ");
       n=sc.nextInt();
       System.out.println("The sum of digits of the number are:"+sumofdigits(n));
       System.out.println("The product of digits of the number are:"+prodofdigits(n));
       reverse(n);
      //System.out.println("The reverse of the number is "+sum);
    }
    static int sumofdigits(int n)
    {
        if(n==0)
        {
            return n;
        }
        return sumofdigits(n/10)+n%10;
    }
    static int prodofdigits(int n)
    {
        if(n%10==n)
        {
            return n;
        }
        return prodofdigits(n/10)*(n%10);
    }
    static int sum=0;
    static void reverse(int n)
    {
        if(n==0)
        {
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
       System.out.println(sum);
        reverse(n/10);
    }
}
