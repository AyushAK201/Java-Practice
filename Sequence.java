import java.util.*;
import java.lang.*;
public class Sequence 
{
    public static void main(String args[])
    {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n=input.nextInt();
        Fun(n);
        System.out.println("\n");
        FunRev(n);
        System.out.println("\n");
        FunBoth(n);
    }
    static void Fun(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        Fun(n-1);
    }
    static void FunRev(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        FunRev(n-1);//Here the functions are called
        // first and once they finish executing the number 
        //is printed.Like if n=5 then it will call FunRev(4) which will call FunRev(3) and so on until n=1 
        //and then all the numbers will be printed
        System.out.println(n);
    }
    static void FunBoth(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        FunBoth(n-1);
        System.out.println(n);
    }
}
