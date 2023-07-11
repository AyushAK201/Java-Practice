import java.util.*;

public class SearchInStrings 
{
   public static void main(String args[])
   {
       String s1="Ayush";
       char ch='u';
       System.out.println(search(s1,ch));
       System.out.println(search2(s1, ch));
       System.out.println(Arrays.toString(s1.toCharArray()));
   }
   static boolean search(String str,char target)
   {
       if(str.isEmpty())
       {
        return false;
       }
       for(int i=0;i<str.length();i++)
       {
        if(target==str.charAt(i))
        {
            return true;
        }
       }
       return false;
   }    
   static boolean search2(String str,char target)
   {
       if(str.isEmpty())
       {
        return false;
       }
       for(char ch1:str.toCharArray())
       {
        if(target==ch1)
        {
            return true;
        }
       }
       return false;
   }    
}
