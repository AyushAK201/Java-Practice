import java.util.*;
import java.lang.*;
public class ArrayLists 
{
   public static void main(String agrs[])
   {
      Scanner sc=new Scanner(System.in);
      //Syntax
      ArrayList<Integer>list=new ArrayList<>(10);
      list.add(67);
      list.add(678);
      list.add(679);
      list.add(670);
      list.add(671);
      System.out.println(list);
      //input
      for(int i=0;i<5;i++)
      {
         list.add(sc.nextInt());
      }
      //get item at any index
      for(int i=0;i<5;i++)
      {
         System.out.println(list.get(i));//pass index here,list[index] syntax will not work here
      }
      System.out.println(list);
   }    
}
