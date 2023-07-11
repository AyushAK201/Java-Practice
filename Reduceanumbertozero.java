import java.util.*;
import java.lang.*;
public class Reduceanumbertozero 
{
     public static void main(String args[])
     { 
         int n;
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter the number: ");
         n=sc.nextInt();
         System.out.println(numberofsteps(n));
        steps(n);
        System.out.println("\n");
        System.out.println(steps(n));
     }  
     static int steps(int n)
     {
        //int rem=0;
        int step=0;
        if(n%2==0)
        {
            n=n/2;
            step++;
        }
        else{
            n=n-1;
            step++;
        }
        if(n==0)
        {
            return step;
        }
       return steps(n-1);
     }  
    static int numberofsteps(int n)
    {
        return helper(n,0);

    }
    private static int helper(int n, int steps) 
    {
        if(n==0)
        {
            return steps;
        }
        if(n%2==0)
        {
            return helper(n/2,steps+1);
        } 
        return helper(n-1,steps+1);
       
        //return 0;
    }
}
