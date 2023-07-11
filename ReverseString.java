import java.lang.*;
import java.util.*;
public class ReverseString 
{
    public static void main(String args[])
    {
        int n=10;
        String s1=n + "0";
        s1=s1.substring(0, s1.length()-1);
        reverse(s1);
        System.out.println();
        reverse2(" ","ayush");
    }   
    static void reverse(String str)
    {
        if(str.isEmpty())
        {
            return;
        }
        //char ch1=up.charAt(0);
        System.out.print(str.charAt(str.length()-1));
        reverse(str.substring(0, str.length()-1));;
    } 
    static void reverse2(String string, String string2)
    {
        if(string2.isEmpty())
        {
            System.out.println(string);
            return;
        }
        char ch=string2.charAt(string2.length()-1);
        reverse2(string+ch,string2.substring(0,string2.length()-1));
    }
}
