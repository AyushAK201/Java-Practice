import java.util.*;
import java.lang.*;
public class Pattern5 
{  
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    p5(n);
   } 
   static void p5(int n)
   {
      for(int row=0;row<n;row++)
      {
        int totalcolsinrows=row>n/2?n-row:row;
        for(int col=0;col<=totalcolsinrows;col++)
        {
            System.out.print("* ");
        }
        System.out.println();
      }
   }
}
