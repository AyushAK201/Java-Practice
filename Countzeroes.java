import java.util.*;
import java.lang.*;
public class Countzeroes 
{
   public static void main(String args[])
   {
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number: ");
    n=sc.nextInt();
    System.out.println("The number of zeroes is " +count(n));
   } 
   static int count(int n)
   {
    return helper(n,0);
   }
public static int helper(int n, int c) 
{ 
    if(n==0)
    {
    return c;
    }
   int rem=n%10;
   if(rem==0)
   {
    return helper(n/10, c+1);
   }
   return helper(n/10,c);
}
}
