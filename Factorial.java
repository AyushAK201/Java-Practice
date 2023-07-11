import java.util.*;
import java.lang.*;
public class Factorial {
    public static void main(String args[])
    {
       int n;
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a number: ");
       n=sc.nextInt();
       System.out.println("The factorial of " +n+ " is " +Factorial(n));
       System.out.println("The sum of "+ n+ "numbers is "+ sum(n));
    }
    static int Factorial(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        return n*Factorial(n-1);
    }
    static int sum(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        return n+sum(n-1);
    }
    
}
